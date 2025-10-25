/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FABIAN
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    
public void setProfesor(Profesor p) {
    if (this.profesor == p) return; // Evita recursión infinita

    if (this.profesor != null) {
        this.profesor.getCursos().remove(this);
    }

    this.profesor = p;

    if (p != null && !p.getCursos().contains(this)) {
        p.getCursos().add(this);
    }
}


    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo +
            " | Profesor: " + (profesor != null ? profesor.getId() : "Sin asignar"));
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
