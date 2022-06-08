package ortiz.sanchez.jonathan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ortiz.sanchez.jonathan.model.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
