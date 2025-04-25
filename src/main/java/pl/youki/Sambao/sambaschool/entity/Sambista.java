package pl.youki.Sambao.sambaschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.youki.Sambao.sambaschool.Instrument;

@Entity
@Getter
@RequiredArgsConstructor
public class Sambista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private Instrument instrument;

    @ManyToOne(targetEntity = School.class, fetch = FetchType.LAZY)
    private School school;

    @Column(nullable = true)
    private boolean manager;

    @OneToOne(targetEntity = SUser.class, fetch = FetchType.LAZY)
    private SUser userData;

}
