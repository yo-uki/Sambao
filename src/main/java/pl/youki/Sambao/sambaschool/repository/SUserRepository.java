package pl.youki.Sambao.sambaschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.youki.Sambao.sambaschool.entity.SUser;

import java.util.Optional;

@Repository
public interface SUserRepository extends JpaRepository<SUser, Long> {

    Optional<SUser> findByLogin(String login);

}