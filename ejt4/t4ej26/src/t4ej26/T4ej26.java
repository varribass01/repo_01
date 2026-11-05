
package t4ej26;
import java.util.Scanner;
/**
 *
 * Escribe un programa que contenga un método
llamado esPrimo que reciba un número entero como
parámetro y devuelva un booleano que indique si se trata de
un número primo o no.
 */
public class T4ej26 {
    
    public static int pedirNumero() {
        //Creo el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Le pido un número al usuario
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        return num;
    }

    public static boolean esPrimo(int num) {
        //Declaro la constante booleana
        boolean pass = true;
        //Declaro una constante que servirá como iteración
        int i;
        //Hago un bucle for con un if para ver si es primo o no
        for (i = 2; i<num ; i++) {
            if (num % i == 0) {
                System.out.println("No es primo oleeee");
                pass = false;
            } 
        }
        return pass;
    }
    
    public static void main(String[] args) {
        //Declaro las variables
        int num = pedirNumero();
        boolean pass = esPrimo(num);
        //Hago un if para que si la variable booleana es falsa no salga nada
        if (pass == true) {
            System.out.println("Vaya pena, tu número es primo");
        }
    }
    
}
