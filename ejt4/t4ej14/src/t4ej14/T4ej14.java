
package t4ej14;
import java.util.Scanner;
/**
 *
 * Crea un programa en JAVA que que imprima todos
los números múltiplos de 3 que existen entre el número 1 y otro
número introducido por el usuario.
• Controla que el usuario te meta un número mayor que 0 y, sino,
avísale del error y vuélveselo al pedir las veces que hagan falta.
• Por último infórmale al usuario del total de números mostrados.
• Crea un método para pedir el dato al usuario, otro para comprobar
que es mayor que 0 y otro para hacer los cálculos y mostrar el
resultado.
 */
public class T4ej14 {
    
    public static int pedirNumero() {
        //Creo el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Declaro la variable y se la pido al usuario
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        return num;
    }
    
    public static boolean validarNumero(int num) {
        //Declaro una variable booleana
        boolean validacion = false;
        //Hago un if para que si el número es mayor que cero, se haga true
        if (num > 0) {
            validacion = true;
        }else {
            System.out.println("ERROR: Escribe un número mayor que 0");
        }
        return validacion;
    }
    
    public static void calculos(int num, boolean validacion) {
        //declaro una variable i para que itere
        int i;
        //Hago un for en el que dentro se harán los cálculos
        for (i = 1; i <=num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        //Llamo a los métodos para mostrar el resultado
        int num = pedirNumero();
        boolean validacion = validarNumero(num);
        calculos(num, validacion);
    }
    
}
