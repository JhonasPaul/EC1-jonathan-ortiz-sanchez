package ortiz.sanchez.jonathan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ortiz.sanchez.jonathan.model.Curso;
import ortiz.sanchez.jonathan.model.MallaCurricular;

public interface MallaCurrilularRepository extends JpaRepository<MallaCurricular,Long> {
}
