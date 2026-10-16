
package t3ej16;

/**
 *
 * @author alumno
 */
public class T3ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro la variable cant, que es la cantidad de impares, imp, que son los impares y la variable i que es la iteración
    int cant = 0, i, imp = 0;
    //Hago un bucle for que me cuente los impares
    for (i = 20; i <= 160; i++) {
        //hago un if para que sume una unidad a cant por cada impar
        if (i % 2 != 0) {
            imp = i; //Aquí hago que cada impar se ponga en el valor de imp
            cant++;
            System.out.println(imp);
        }
        
    }
    //Enseño la cantidad de impares
    System.out.println("La cantidad de impares es: " + cant);
    }
    
}
