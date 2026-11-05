
package t4ej17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4ej17 {
    
    public static int generarLetra() {
        //Declaro las variables
        int letraPc, min = 97, max = 122;
        //genero la letra al azar
        letraPc = (int) (Math.random() * (max - min + 1)) + min;
        return letraPc;
    }
    public static int pedirLetra() {
        //Declaro la variable
        char letraUsuario;
        //Creo el objeto scanner
        Scanner sc = new Scanner(System.in);
        //Le pido la letra al usuario
        System.out.println("Introduzca una letra minuscula: ");
        letraUsuario = sc.nextLine().charAt(0);
        //Paso la letra a código ASCII
        int asciiLetraUsuario = (int) letraUsuario;
        return asciiLetraUsuario;
    }
    
    public static void main(String[] args) {
        //Me traigo la letra generada al azar y declaro la siguiente variable
        int letraPc = generarLetra(), letraUsuario, i = 0;
        //Hago un bucle do while en el que se le pida la letra al usuario y no se rompa hasta que adivine
        do {
            //Le pido la letra al usuario
            letraUsuario = pedirLetra();
            //Hago una variable i que vaya incrementando que simboliza el nº de intentos
            i++;
            //Hago un condicional if que me diga si la letra está antes o después en el alfabeto
            if (letraUsuario < letraPc) {
                System.out.println("La letra que has escrito va antes en el alfabeto");
            }
            if (letraUsuario > letraPc) {
                System.out.println("La letra que has escrito va despues en el alfabeto");
            }
        }while(letraUsuario != letraPc);
        System.out.println("BIEEEEEEEEN, has acertado, solo lo has intentado: " + i + " veces");
        
    }
    
}
