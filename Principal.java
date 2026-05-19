public class Principal {

    public static void main(String [] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumnos.txt");
        try {
            alumnoDAO.agregaAlumno(new Alumno(98765, "Saul Hernardez", 8.5));
        }
        catch (EstudianteDuplicadoException e) {
            System.out.println(e.getMessage());
        }
    }
}