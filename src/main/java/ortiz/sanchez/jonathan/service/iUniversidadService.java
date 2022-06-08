package ortiz.sanchez.jonathan.service;

import ortiz.sanchez.jonathan.model.Curso;
import ortiz.sanchez.jonathan.model.Universidad;

import java.util.List;

public interface iUniversidadService {
    Universidad guardarUniversidad(Universidad universidad);
    void eliminarUniversidad(Long id);
    List<Universidad> listarUniversidad();
    Universidad obtenerUniversidadPorId(Long id);
}
