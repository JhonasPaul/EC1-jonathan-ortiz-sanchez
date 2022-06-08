package ortiz.sanchez.jonathan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ortiz.sanchez.jonathan.model.Profesor;
import ortiz.sanchez.jonathan.service.ProfesorServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesorController {
    @Autowired
    private ProfesorServiceImpl service;

    @GetMapping("/profesor")
    public List<Profesor> index() {
        return service.listarProfesor();
    }


    @GetMapping("/profesor/{id}")
    public Profesor show(@PathVariable Long id) {
        return this.service.obtenerProfesorPorId(id);
    }

    @PostMapping("/profesor")
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor create(@RequestBody Profesor Profesor) {
        this.service.guardarProfesor(Profesor);
        return Profesor;
    }

    @PutMapping("/profesor/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor update(@RequestBody Profesor Profesor, @PathVariable Long id) {
        Profesor profesor = this.service.obtenerProfesorPorId(id);
        profesor.setProfesor(Profesor.getProfesor());
        this.service.guardarProfesor(profesor);
        return profesor;
    }

    @DeleteMapping("/profesor/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Profesor profesor = this.service.obtenerProfesorPorId(id);
        this.service.eliminarProfesor(id);
    }
}
