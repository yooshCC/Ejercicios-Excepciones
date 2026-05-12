import java.util.InputMismatchException;//Importar para su uso
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ejercicio1{
    public static void main(String [] args){
        File archivo = new File("entrada.txt");
        PrintWriter salida = null;
        Scanner teclado = null; 
        int a, b;
        
        try{
            teclado = new Scanner(archivo);
            salida = new PrintWriter("salida.txt");

            a = teclado.nextInt();
            b = teclado.nextInt();
            salida.println("La división es:" + a/b);
        }
        catch(InputMismatchException e){
            salida.println("Entrada no valida");
        }
        catch(ArithmeticException e){
            salida.println("No se puede dividir entre 0");
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        }
        finally{
            if(teclado != null){
                teclado.close();
            }
            if(salida != null){
                salida.close();
            }
        }
    }
}