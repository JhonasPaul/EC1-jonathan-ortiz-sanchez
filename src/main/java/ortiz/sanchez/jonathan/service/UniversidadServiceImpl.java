package ortiz.sanchez.jonathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ortiz.sanchez.jonathan.model.Universidad;
import ortiz.sanchez.jonathan.repository.UniversidadRepository;

import java.util.List;

@Service
public class UniversidadServiceImpl implements iUniversidadService{
    @Autowired
    private UniversidadRepository repository;

    @Override
    public Universidad guardarUniversidad(Universidad universidad) {
        return repository.save(universidad);
    }

    @Override
    public void eliminarUniversidad(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Universidad> listarUniversidad() {
        return repository.findAll();
    }

    @Override
    public Universidad obtenerUniversidadPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
