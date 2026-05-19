public class Principal {

    public static void main(String [] args) {
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumno.txt");
        try {
            alumnoDAO.eliminarALumno(123455);
        }
        catch (EstudianteDuplicadoException e) {
            System.out.println(e.getMessage());
        }
    }
}