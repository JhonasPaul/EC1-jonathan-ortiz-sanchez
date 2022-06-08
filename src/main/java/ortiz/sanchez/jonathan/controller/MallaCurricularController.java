package ortiz.sanchez.jonathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ortiz.sanchez.jonathan.model.MallaCurricular;
import ortiz.sanchez.jonathan.service.MallaCurricularServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MallaCurricularController {
    @Autowired
    private MallaCurricularServiceImpl service;

    @GetMapping("/mallaCurricular")
    public List<MallaCurricular> index() {
        return service.listarMallaCurricular();
    }


    @GetMapping("/mallaCurricular/{id}")
    public MallaCurricular show(@PathVariable Long id) {
        return this.service.obtenerMallaCurricularPorId(id);
    }

    @PostMapping("/mallaCurricular")
    @ResponseStatus(HttpStatus.CREATED)
    public MallaCurricular create(@RequestBody MallaCurricular mallaCurricular) {
        this.service.guardarMallaCurricular(mallaCurricular);
        return mallaCurricular;
    }

    @PutMapping("/mallaCurricular/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public MallaCurricular update(@RequestBody MallaCurricular mallaCurricular, @PathVariable Long id) {
        MallaCurricular mallaCurricular1 = this.service.obtenerMallaCurricularPorId(id);
        mallaCurricular1.setAños(mallaCurricular.getAños());
        mallaCurricular1.setUniversidad(mallaCurricular.getUniversidad());
        this.service.guardarMallaCurricular(mallaCurricular1);
        return mallaCurricular1;
    }

    @DeleteMapping("/mallaCurricular/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        MallaCurricular mallaCurricular1 = this.service.obtenerMallaCurricularPorId(id);
        this.service.eliminarMallaCurricular(id);
    }
}
