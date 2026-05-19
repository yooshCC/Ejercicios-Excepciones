import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AlumnoClase{
    private int clave;
    private String nombre;
    private Double calificacion;

    public AlumnoClase(int clave, String nombre, Double calificaion){
        this.clave =clave;
        this.nombre = nombre;
        this.calificacion = calificaion;
    }
    @Override
    public String toString()
    {
        return clave + "";
    }

    public void agregaAlumno(Alumno alumno){
        PrintWriter salida = null;
        FileWriter archivo = null;
        try{
            List<Alumno> alumnos = new this.leerTodos();
            if(alumnos.contains(alumnos)){

            }
        }
        catch(IOException e){
            System.out.println("Error del archivo" + nombreArchivo);
        }
        catch(FormatoArchivoExecption e){
            System.out.println();
        }
    }
}
