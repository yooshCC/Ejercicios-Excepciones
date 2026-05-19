import java.util.List;;

public class Principa {
    public static void main(String[] args){
        AlumnoDAO alumnoDAO = new AlumnoDAO("alumno.txt");
        try{
        /*List<Alumno> alumnos = alumnoDAO.leerTodos();
        System.out.println(alumnos);*/
            
        }
        catch(FormatoArchivoExecption e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
