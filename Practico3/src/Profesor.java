/**
 *
 * @author FABIAN
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    
public void agregarCurso(Curso c) {
    if (!cursos.contains(c)) {
        cursos.add(c);
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }
}


    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            c.setProfesor(null);
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println("Curso: " + c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | Especialidad: " + especialidad + " | Cursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
