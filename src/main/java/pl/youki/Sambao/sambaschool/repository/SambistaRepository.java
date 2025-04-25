package pl.youki.Sambao.sambaschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.youki.Sambao.sambaschool.entity.Sambista;

import java.util.List;

@Repository
public interface SambistaRepository extends JpaRepository<Sambista, Long> {

    List<Sambista> findByNameIgnoreCase(String name);

}