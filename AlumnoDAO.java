import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoDAO {
    // DAO: Data Access Object
    private String nombreArchivo;

    public AlumnoDAO(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public List<Alumno> leerTodos(){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner entrada = null;
        
        //Abrimos el archivo (codigo riegoso = try)
        try{
            entrada = new Scanner(new File(nombreArchivo));
            while(entrada.hasNext()){
                String linea = entrada.nextLine();
                String [] arreglo = linea.splitWithDelimiters(",", 3);
                int clave = Integer.parseInt(arreglo[0]);
                Double calificacion = Double.parseDouble(arreglo[4]);
                Alumno alumno = new Alumno(clave, arreglo[2], calificacion);
                listaAlumnos.add(alumno);
            }
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo no encontrado" + nombreArchivo);
        }
        finally{
            if(entrada != null){
                entrada.close();
            }
        }

        return listaAlumnos;
    }
}
