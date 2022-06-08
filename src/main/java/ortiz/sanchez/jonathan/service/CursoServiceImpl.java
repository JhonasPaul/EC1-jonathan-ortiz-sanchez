package ortiz.sanchez.jonathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ortiz.sanchez.jonathan.model.Curso;
import ortiz.sanchez.jonathan.repository.CursoRepository;

import java.util.List;

@Service
public class CursoServiceImpl implements  iCursoService{
    @Autowired

    private CursoRepository repository;

    @Override
    public Curso guardarCurso(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public void eliminarCurso(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Curso> listarCurso() {
        return repository.findAll();
    }

    @Override
    public Curso obtenerCursoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
