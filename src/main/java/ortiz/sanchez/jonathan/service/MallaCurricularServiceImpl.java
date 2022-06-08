package ortiz.sanchez.jonathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ortiz.sanchez.jonathan.model.MallaCurricular;
import ortiz.sanchez.jonathan.repository.MallaCurrilularRepository;

import java.util.List;

@Service
public class MallaCurricularServiceImpl implements iMallaCurricularService{
    @Autowired
    private MallaCurrilularRepository repository;

    @Override
    public MallaCurricular guardarMallaCurricular(MallaCurricular mallaCurricular) {
        return repository.save(mallaCurricular);
    }

    @Override
    public void eliminarMallaCurricular(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<MallaCurricular> listarMallaCurricular() {
        return repository.findAll();
    }

    @Override
    public MallaCurricular obtenerMallaCurricularPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
