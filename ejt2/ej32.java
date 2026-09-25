

package ejerciciot2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ej32 {
    public static void main(String[] args){
    //creo el objeto scanner
    Scanner entrada = new Scanner(System.in);
    //Declaro variables
    int dinero, billete50, billete20, billete10, moneda2, moneda1;
    //Le pido al usuario una cantidad de dinero
    System.out.println("Por favor, pon una cantidad de dinero: ");
    dinero = entrada.nextInt();
    //descompongo el dinero en billetes y monedas
    billete50 = dinero / 50;
    billete20 = (dinero % 50) / 20;
    billete10 = ((dinero % 50) % 20) / 10;
    moneda2 = (((dinero % 50) % 20) % 10) / 2;
    moneda1 = (((dinero % 50) % 20) % 10) % 2; 
    //Enseño el resultado
    System.out.println("Tu dinero se descompone en: " + billete50 + " billetes de 50, " + billete20 + " billetes de 20, "
    + billete10 + " billetes de 10, " + moneda2 + " monedas de 2 y " + moneda1 + " monedas de 1");
    }
    
}
