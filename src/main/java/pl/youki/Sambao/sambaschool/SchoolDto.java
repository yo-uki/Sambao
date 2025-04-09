package pl.youki.Sambao.sambaschool;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SchoolDto {

    private Long id;

    @Setter
    private String name;

    @Setter
    private String contact;

    @Setter
    private String director;

    @Setter
    private String manager;

    @Setter
    private String address;

}
