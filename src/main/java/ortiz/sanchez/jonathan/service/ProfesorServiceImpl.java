package ortiz.sanchez.jonathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ortiz.sanchez.jonathan.model.Profesor;
import ortiz.sanchez.jonathan.repository.ProfesorRepository;

import java.util.List;

@Service
public class ProfesorServiceImpl implements iProfesorService{

    @Autowired
    private ProfesorRepository repository;

    @Override
    public Profesor guardarProfesor(Profesor profesor) {
        return repository.save(profesor);
    }

    @Override
    public void eliminarProfesor(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Profesor> listarProfesor() {
        return repository.findAll();
    }

    @Override
    public Profesor obtenerProfesorPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
