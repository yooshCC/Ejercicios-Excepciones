import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args ){
        Scanner teclado= new Scanner(System.in);
        int indice;
        String [] nombres = {"Roberto", "Adrian", "Issac", "Hugo"};

        try{
            System.out.println("Contenido del Arreglo: ");
            for(int i=0; i<nombres.length; i++ ){
                System.out.print(nombres[i] + " ");
            }
            System.out.println();
            System.out.println("Selecciona un indice: ");
            indice = teclado.nextInt();
            System.out.println(nombres[indice]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No se puede seleccionar un elemento invalido");
        }
        finally{
            teclado.close();
        }
    }
}
