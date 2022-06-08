package ortiz.sanchez.jonathan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ortiz.sanchez.jonathan.model.Curso;
import ortiz.sanchez.jonathan.model.Universidad;

public interface UniversidadRepository extends JpaRepository<Universidad,Long> {
}
