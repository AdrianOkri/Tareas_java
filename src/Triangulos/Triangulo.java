package Triangulos;

import java.util.Scanner;

/**
 *
 * @author WASP
 */
public class Triangulo {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in); // Crear un objeto para leer datos del teclado
        int i, j, k;
		    
        System.out.println("Ingresé el tamaño de la figura");
        int tam =  read.nextInt(); // Variable que guardará el tamaño que se quiera de la figura
                    // *************** Primer triangulo
		    for (i = tam; i >= 0; i --) {
		        for (j = 1; j <= i; j++) {
		            System.out.print(" "); // Mientra i se vuelva más grande en cada iteración, más espacios se imprimiran
		        }
		        for (k = tam; k >= j; k--) { // Mientras j sea más grande, menos espacios en asteriscos va a mostrarse
		            System.out.print("*");
		        }
		        System.out.println("");
		    }
		    
		    System.out.print("");
		    // *************** Segundo triangulo
		    for (i = 0; i <= tam; i++) {
		        for (j = 0; j < i; j++) {
		            System.out.print("*"); // Mientra i se vuelva más grande en cada iteración, más astericos se imprimiran
		        }
		        for (k = tam; k > j; k--) {
		            System.out.print(" "); // Mientras j sea más grande, menos espacios en blanco va a mostrarse
		        }
		        System.out.println("");
		    }
                    
                    System.out.println("");
                    // *************** Tercer triangulo
                    for (i = tam; i >= 0; i--) { // El ciclo for se hará cada vez más "pequeño"
                        for(j = 0; j <= i; j++) {
                            System.out.print("*"); // Imprimir un asterisco hasta que j <= i
                        }
                        System.out.println(""); // Imprimir un salto de línea
                    }
    }
}
