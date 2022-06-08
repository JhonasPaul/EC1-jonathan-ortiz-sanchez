package ortiz.sanchez.jonathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ortiz.sanchez.jonathan.model.Curso;

import ortiz.sanchez.jonathan.service.CursoServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CursoController {
    @Autowired
    private CursoServiceImpl service;
    @GetMapping("/curso")
    public List<Curso> index() {
        return service.listarCurso();
    }


    @GetMapping("/curso/{id}")
    public Curso show(@PathVariable Long id) {
        return this.service.obtenerCursoPorId(id);
    }

    @PostMapping("/curso")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso create(@RequestBody Curso Curso) {
        this.service.guardarCurso(Curso);
        return Curso;
    }

    @PutMapping("/curso/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso update(@RequestBody Curso Curso, @PathVariable Long id) {
        Curso curso = this.service.obtenerCursoPorId(id);
        curso.setCurso(Curso.getCurso());
        curso.setDescripcion(Curso.getDescripcion());
        curso.setMallaCurricular(Curso.getMallaCurricular());
        this.service.guardarCurso(curso);
        return curso;
    }

    @DeleteMapping("/curso/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Curso curso = this.service.obtenerCursoPorId(id);
        this.service.eliminarCurso(id);
    }

}
