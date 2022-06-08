package ortiz.sanchez.jonathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ortiz.sanchez.jonathan.model.Universidad;
import ortiz.sanchez.jonathan.service.UniversidadServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UniversidadController {
    @Autowired
    private UniversidadServiceImpl service;

    @GetMapping("/universidad")
    public List<Universidad> index() {
        return service.listarUniversidad();
    }


    @GetMapping("/universidad/{id}")
    public Universidad show(@PathVariable Long id) {
        return this.service.obtenerUniversidadPorId(id);
    }

    @PostMapping("/universidad")
    @ResponseStatus(HttpStatus.CREATED)
    public Universidad create(@RequestBody Universidad universidad) {
        this.service.guardarUniversidad(universidad);
        return universidad;
    }

    @PutMapping("/universidad/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Universidad update(@RequestBody Universidad universidad, @PathVariable Long id) {
        Universidad universidadActual = this.service.obtenerUniversidadPorId(id);
        universidadActual.setUniversidad(universidad.getUniversidad());
        this.service.guardarUniversidad(universidadActual);
        return universidadActual;
    }

    @DeleteMapping("/universidad/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Universidad universidadActual = this.service.obtenerUniversidadPorId(id);
        this.service.eliminarUniversidad(id);
    }
}
