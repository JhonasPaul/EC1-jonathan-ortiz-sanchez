package ortiz.sanchez.jonathan.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profesor;


    @ManyToMany(mappedBy = "profesor", cascade ={CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> curso = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<Curso> getCursos() {
        return curso;
    }

    public void setCursos(List<Curso> cursos) {
        this.curso = cursos;
    }
}
