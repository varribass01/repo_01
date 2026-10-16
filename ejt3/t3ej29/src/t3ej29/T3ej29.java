
package t3ej29;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T3ej29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //declaro las variables
        int numPc, numUsuario, i = 0;
        //genero el número al azar
        numPc = (int)(Math.random() * 101);
        //Hago un bucle para que el usuario escriba el número y un if con cada caso posible
        do {
            System.out.println("Escribe un numero entre el 1 y el 100");
            numUsuario = sc.nextInt();
            if (numUsuario != numPc && numUsuario < numPc) {
                System.out.println("No, tu numero es menor al numero que buscas");
                System.out.println("-------------------------------------------");
                i++;
            }
            if (numUsuario != numPc && numUsuario > numPc) {
                System.out.println("No, tu numero es mayor al numero que buscas");
                System.out.println("-------------------------------------------");
                i++;
            }
            if (numUsuario == numPc) {
                System.out.println("BIEEEEEEEEEEEN, LO HAS ADIVINADO");
                System.out.println("Solo has tardado " + i + " intentos");
            }
        }
        while (numUsuario != numPc);
    }
    
}
