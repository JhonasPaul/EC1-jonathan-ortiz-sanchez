package ortiz.sanchez.jonathan.service;

import ortiz.sanchez.jonathan.model.Curso;

import java.util.List;

public interface iCursoService {
    Curso guardarCurso(Curso curso);
    void eliminarCurso(Long id);
    List<Curso> listarCurso();
    Curso obtenerCursoPorId(Long id);
}
