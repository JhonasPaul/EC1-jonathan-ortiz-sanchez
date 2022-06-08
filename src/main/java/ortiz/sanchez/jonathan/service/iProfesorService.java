package ortiz.sanchez.jonathan.service;

import ortiz.sanchez.jonathan.model.Profesor;

import java.util.List;

public interface iProfesorService {
    Profesor guardarProfesor(Profesor profesor);
    void eliminarProfesor(Long id);
    List<Profesor> listarProfesor();
    Profesor obtenerProfesorPorId(Long id);
}
