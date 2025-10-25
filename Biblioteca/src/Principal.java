/**
 *
 * @author FABIAN SALAS
 * COMISION 17
 */
public class Principal {
    public static void main(String[] args) {
       
Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chilena");

        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("L003", "La casa de los espíritus", 1982, a3);
        biblioteca.agregarLibro("L004", "Crónica de una muerte anunciada", 1981, a1);
        biblioteca.agregarLibro("L005", "Ficciones", 1944, a2);

        System.out.println("Listado de libros:");
        biblioteca.listarLibros();

        System.out.println("Buscar libro por ISBN 'L003':");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("Filtrar libros por año 1949:");
        biblioteca.filtrarLibrosPorAnio(1949);

        System.out.println("Eliminar libro 'L002':");
        biblioteca.eliminarLibro("L002");
        biblioteca.listarLibros();

        System.out.println("Cantidad total de libros:");
        System.out.println(biblioteca.obtenerCantidadLibros());

        System.out.println("Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
}

