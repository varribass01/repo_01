
package t3ej9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T3ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //creo el objeto scanner
    Scanner entrada = new Scanner(System.in);
    //declaro variables
    int num1, num2, num3, num4, posicion1, posicion2, posicion3, posicion4, posicion5, i;
    //pido al usuario los números
    System.out.println("Por favor, introduzca el primer numero: ");
    num1 = entrada.nextInt();
    System.out.println("Ahora el segundo numero: ");
    num2 = entrada.nextInt();
    System.out.println("Ahora el tercer numero: ");
    num3 = entrada.nextInt();
    System.out.println("Ahora el cuarto numero: ");
    num4 = entrada.nextInt();
    //Aplico el método burbuja, para ello he hecho unas variables de posiciones para que los números vayan variando de posición
    posicion1 = num1;
    posicion2 = num2;
    posicion3 = num3;
    posicion4 = num4;
    posicion5 = 0;
    //Ahora voy a hacer un bucle for ya que sé que voy a tener que repetir el mismo procedimiento 3 veces
    for (i = 0; i <=3; i++) {
    //hago condicionales para mover de posición a los números
    if (posicion1 > posicion2) {
        posicion5 = posicion2;
        posicion2 = posicion1;
        posicion1 = posicion5;
        posicion5 = 0;
    }
    //por lo tanto ahora posición 2 es el num1 y la posición 1 es el num2 y la posicion5 vuelve a ser 0
    if (posicion2 > posicion3) {
        posicion5 = posicion3;
        posicion3 = posicion2;
        posicion2 = posicion5;
        posicion5 = 0;}
    //siguiente condición para terminar la primera vuelta
    if (posicion3 > posicion4) {
        posicion5 = posicion4;
        posicion4 = posicion3;
        posicion3 = posicion5;
        posicion5 = 0;}
    }
    System.out.println("El orden de los numeros es " + posicion1 + posicion2 + posicion3 + posicion4);
    }
    
}
