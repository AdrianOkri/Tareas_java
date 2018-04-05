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
        int tam =  read.nextInt();
            
		    for (i = tam; i >= 0; i --) {
		        for (j = 1; j <= i; j++) {
		            System.out.print(" ");
		        }
		        for (k = tam; k >= j; k--) {
		            System.out.print("*");
		        }
		        System.out.println("");
		    }
		    
		    System.out.print("");
		    
		    for (i = 0; i <= tam; i++) {
		        for (j = 0; j < i; j++) {
		            System.out.print("*");
		        }
		        for (k = tam; k > j; k--) {
		            System.out.print(" ");
		        }
		        System.out.println("");
		    }
                    
                    System.out.println("");
                    
                    for (i = tam; i >= 0; i--) {
                        for(j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
    }
}
