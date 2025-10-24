package aula.eliel.aula.repository;

import aula.eliel.aula.model.Biblioteca;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibRepository extends JpaRepository<Biblioteca,Long> {
}
