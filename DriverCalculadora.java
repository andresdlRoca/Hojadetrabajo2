import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase driver que hace el funcionamiento de la calculadora
 * @author Andres de la Roca
 */

public class DriverCalculadora {
    
    /**
     * Metodo main que correra la calculadora con notacion postfix
     * @param args
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        boolean run = true;

        while (run) {

            try {
                
                System.out.println("\nBienvenido a la calculadora de notacion Postfix");

                System.out.println("\nElige una opcion");
                System.out.println("1. Calcular la operacion del archivo de texto");
                System.out.println("2. Salir");
        
                int opcion = scan.nextInt();
        
                if(opcion == 1){
                    System.out.println("El resultado es: " + calc.Calculo("6 2 3 + *"));
                } else if (opcion == 2) {
                    System.out.println("Hasta luego!");
                    run = false;
                } else {
                    System.out.println("Se ingreso una opcion invalida, intentelo de nuevo");
                }



            } catch (InputMismatchException e) {
                System.err.println("Eligio una opcion incorrecta");
                scan.nextLine();
            }


        }

    }

}
