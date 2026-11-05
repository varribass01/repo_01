
package t4ej20;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4ej20 {
    
    public static String pedirRespuesta() {
        //Hago este método para pedirle las respuestas al usuario
        //Creo el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Le pido una respuesta al usuario
        System.out.println("Introduzca su respuesta aqui: ");
        String respuesta = sc.nextLine();
        return respuesta;
    }
    
    public static void main(String[] args) { 
        //Declaro las variables
        int nota = 0, respuestasCorrectas = 0;
        String respuesta1 = "Madrid";
        String respuesta2 = "Colón";
        //Escribo lo que es el examen
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println("-------------------------");
        System.out.println("PRIMERA PREGUNTA: Cual es la capital de espania?");
        //Pido la primera respuesta
        String respuestaUsuario1 = pedirRespuesta();
        //Hago un if para que se vaya sumando la nota en respuestasCorrectas
        if (respuestaUsuario1.equalsIgnoreCase(respuesta1)) {
            respuestasCorrectas++;
        }
        //Sigo con el examen
        System.out.println("SEGUNDA PREGUNTA: Quien descubrio America? (Solo su apellido)");
        //Pido la segunda respuesta
        String respuestaUsuario2 = pedirRespuesta();
        if (respuestaUsuario2.equalsIgnoreCase(respuesta2)) {
            respuestasCorrectas++;
        }
        //Hago un if para calcular la nota final
        if (respuestasCorrectas == 1) {
            nota = 5;
        }
        if (respuestasCorrectas == 2) {
            nota = 10;
        }
        System.out.println("Tu nota es: " + nota);
    }
}
