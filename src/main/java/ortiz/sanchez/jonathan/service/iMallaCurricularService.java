package ortiz.sanchez.jonathan.service;

import ortiz.sanchez.jonathan.model.MallaCurricular;

import java.util.List;

public interface iMallaCurricularService {
    MallaCurricular guardarMallaCurricular(MallaCurricular mallaCurricular);
    void eliminarMallaCurricular(Long id);
    List<MallaCurricular> listarMallaCurricular();
    MallaCurricular obtenerMallaCurricularPorId(Long id);
}
