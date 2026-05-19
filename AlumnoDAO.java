import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.IOException;

// DAO = Data Access Object
public class AlumnoDAO {
    private String nombreArchivo;

    public AlumnoDAO(String nombreArchivo)  {
        this.nombreArchivo = nombreArchivo;
    }

    public List<AlumnoClase> obtenerTodos() throws FormatoArchivoException {
        List<AlumnoClase> listaAlumnos = new ArrayList<>();
        Scanner entrada = null;
        File archivo = new File(nombreArchivo);
        String linea = null;
        String [] arreglo = null;

        try{
            entrada = new Scanner(archivo);
            while (entrada.hasNext())   {
                linea = entrada.nextLine();
                arreglo = linea.split(",");
                int clave = Integer.parseInt(arreglo[0]);
                double calificacion = Double.parseDouble(arreglo[2]);
                AlumnoClase alumno = new AlumnoClase(clave, arreglo[1], calificacion);
                listaAlumnos.add(alumno);
            }
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new FormatoArchivoException("Se esperaba un numero");
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nombreArchivo);
        }
        finally {
            if (entrada != null)    {
                entrada.close();
            }
        }

        return listaAlumnos;
    }

    public void agregaAlumno(Alumno alumno) {
        PrintWriter salida = null;
        FileWriter archivo = null;
        try{
            List<AlumnoClase> listaAlumnos = this.obtenerTodos();
            if (listaAlumnos.contains(alumno))  {
                throw new EstudianteDuplicadoException("Ya existe un alumno con la misma clave");
            }
            archivo = new FileWriter(nombreArchivo, true);
            salida = new PrintWriter(archivo);
            salida.println(alumno.toString());
        }
        catch (FormatoArchivoException e)   {
            e.printStackTrace();
        }
        catch (IOException e)   {
            System.out.println("No se puede escribir en el archivo: " + nombreArchivo);
        }
        finally {
            if (salida != null) {
                salida.close();
            }
        }
    }

    
    public void escribirTodo(List<AlumnoClase> listaAlumnos){
        PrintWriter salida = null;
        try{
            salida = new PrintWriter(nombreArchivo);
            for(AlumnoClase alumno : listaAlumnos){
                salida.println(alumno);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(salida!=null){
                salida.close();
            }
        }
    }

    public void eliminarALumno(int claveElimina){
        
        try{
            List<AlumnoClase> alumnos = this.obtenerTodos();
            Iterator<AlumnoClase> it = alumnos.iterator();
            boolean encontrado = false;
            while(it.hasNext()){
                AlumnoClase alumno = it.next();
                if(alumno.getClave() == claveElimina){
                    it.remove();
                    encontrado = true;
                }
            }
            if(!encontrado){
                throw new EstudianteNoEncontrado("No existe el alumno con la clave" + claveElimina);
            }
            escribirTodo(alumnos);
        }
        catch(FormatoArchivoException e){
            System.out.println(e.getMessage());
        }
    }
}
