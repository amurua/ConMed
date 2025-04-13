package ar.edu.unq.spring.persistence;

import ar.edu.unq.spring.modelo.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoDAO extends JpaRepository<Turno, Long> {
}
