package ortiz.sanchez.jonathan.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String curso;
    private String descripcion;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            unique = true
    )
    private MallaCurricular mallaCurricular;

    @ManyToMany(cascade =  CascadeType.MERGE)
    @JoinTable(
            name = "profesor_curso",
            joinColumns = @JoinColumn(
                    nullable = false,
                    unique = true
            ),
            inverseJoinColumns = @JoinColumn(
                    nullable = false,
                    unique = true
            )
    )
    private List<Profesor> profesor = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MallaCurricular getMallaCurricular() {
        return mallaCurricular;
    }

    public void setMallaCurricular(MallaCurricular mallaCurricular) {
        this.mallaCurricular = mallaCurricular;
    }

    public List<Profesor> getProfesores() {
        return profesor;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesor = profesores;
    }
}
