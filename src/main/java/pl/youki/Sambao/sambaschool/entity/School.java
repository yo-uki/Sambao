package pl.youki.Sambao.sambaschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contact;

    @Column(nullable = true)
    private String director;

    @Column(nullable = true)
    private String manager;

    @OneToOne(targetEntity = Address.class)
    private Address address;

    @Column
    private String description;

}
