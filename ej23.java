/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class ej23 {

/**
 * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un objeto scanner
        Scanner entrada = new Scanner(System.in);
        //declaro variables
        float precio;
        int unidades;
        float precioTotal;
        //pido precio al ususario
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextFloat();
        //pido unidades al usuario
        System.out.println("Cuantas unidades quiere llevarse?" );
        unidades = entrada.nextInt();
        //printeo el resultado
        precioTotal = precio * unidades;
        System.out.println("El precio total de tu compra es: " + precioTotal);
    }
   
}
