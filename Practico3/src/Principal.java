/**
 *
 * @author FABIAN
 */
public class Principal {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P001", "Ana Gómez", "Matemática");
        Profesor p2 = new Profesor("P002", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("P003", "María López", "Física");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Programación I");
        Curso c3 = new Curso("C103", "Física I");
        Curso c4 = new Curso("C104", "Estadística");
        Curso c5 = new Curso("C105", "Programación II");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C103", "P003");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C105", "P002");

        System.out.println("--- Cursos ---");
        uni.listarCursos();

        System.out.println("--- Profesores ---");
        uni.listarProfesores();

        System.out.println("--- Cambio de profesor en curso C105 ---");
        uni.asignarProfesorACurso("C105", "P003");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("--- Eliminación del curso C104 ---");
        uni.eliminarCurso("C104");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("--- Eliminación del profesor P002 ---");
        uni.eliminarProfesor("P002");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("--- Reporte de cursos por profesor ---");
        uni.reporteCantidadCursosPorProfesor();
    }
}
