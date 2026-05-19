import java.util.List;

public class Principal {
    public static void main(String [] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumnos.txt");
        alumnoDAO.agregaAlumno(new Alumno(987654,"Pedro Gonzalez", 8.5));
        try {
            List<AlumnoClase> alumnos = alumnoDAO.obtenerTodos();
            System.out.println(alumnos);
        }
        catch (FormatoArchivoException e)   {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
