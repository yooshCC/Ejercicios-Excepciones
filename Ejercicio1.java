import java.util.InputMismatchException;//Importar para su uso
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){
        Scanner teclado= new Scanner(System.in);
        int a, b;
        
        try{
            System.out.println("Escribe el primer numero: ");
            a = teclado.nextInt();
            System.out.println("Escribe el segundo Número:");
            b = teclado.nextInt();
            System.out.println("La división es:" + a/b);
        }
        catch(InputMismatchException e){
            System.out.println("Entrada no valida");
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        finally{
            teclado.close();
        }
    }
}