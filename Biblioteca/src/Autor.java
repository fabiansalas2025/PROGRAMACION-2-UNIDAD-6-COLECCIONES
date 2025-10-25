/**
 *
 * @author FABIAN SALAS
 * COMISION 17
 */
public class Autor { 
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return id;
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("-----------------------------");
    }
}
