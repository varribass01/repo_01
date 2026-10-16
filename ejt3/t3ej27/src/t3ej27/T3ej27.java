
package t3ej27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //declaro las variables
        int num1, num2, opcion, suma, resta, div, prod;
        //Le pido los numeros al usuario
        System.out.println("Dame un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Dame otro numero");
        num2 = entrada.nextInt();
        //Hago un do while con un switch dentro
        do {
            System.out.println("Pulse 1 para sumar");
            System.out.println("Pulse 2 para restar");
            System.out.println("Pulse 3 para multiplicar");
            System.out.println("Pulse 4 para dividir");
            System.out.println("Pulse 5 para salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    suma = num1 + num2;
                    System.out.println("La suma de sus numeros es: " + suma);
                    System.out.println("-----------------------------------");
                    break;
                }
                case 2: {
                    resta = num1 - num2;
                    System.out.println("La resta de sus numeros es: " + resta);
                    System.out.println("-------------------------------------");
                    break;
                }
                case 3: {
                    prod = num1 * num2;
                    System.out.println("El producto de sus numeros es: " + prod);
                    System.out.println("---------------------------------------");
                    break;
                }
                case 4: {
                    div = num1 / num2;
                    System.out.println("El cociente de la division entre sus numeros es: " + div);
                    System.out.println("-------------------------------------------------------");
                    break;
                }
                case 5: {
                    System.out.println("Gracias por usar el programa :)");
                    break;
                }
            }
        }
        while (opcion != 5);
    }
    
}
