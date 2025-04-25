package pl.youki.Sambao.sambaschool.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.youki.Sambao.sambaschool.entity.SUser;
import pl.youki.Sambao.sambaschool.repository.SUserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SUserDetailsService implements UserDetailsService {

    private final SUserRepository sUserRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        System.out.println("login jest: " + login);

        Optional<SUser> sUserOpt = Optional.ofNullable(sUserRepository.findByLogin(login)
                .orElseThrow(() -> new UsernameNotFoundException("Nie znaleziono użytkownika: " + login)));

        System.out.println("login znalazło: " + login + sUserOpt.isPresent());

        SUser sUser = sUserOpt.get();

        return User
                .withUsername(sUser.getLogin())
                .password(sUser.getPassword())
                .roles(sUser.getRole())
                .build();
    }
}
