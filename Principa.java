import java.util.List;;

public class Principa {
    public static void main(String[] args){
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumno.txt");
        List<Alumno> alumnos = alumnoDAO.leerTodos();
        System.out.println(alumnos);
    }
}
