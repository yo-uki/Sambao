package pl.youki.Sambao.sambaschool;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.youki.Sambao.sambaschool.repository.SchoolRepository;

@Service
@RequiredArgsConstructor
public class SambaSchoolService {

    @Autowired
    final SchoolRepository schoolRepository;

}
