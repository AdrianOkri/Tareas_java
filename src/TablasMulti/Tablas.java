package TablasMulti;

import java.util.Scanner; // Importar la librería para poder leer datos del teclado 
/**
 *
 * @author WASP
 */
public class Tablas {
    
    public static void CicloDoWhile(int n, int n2){
        int i = 0,j, result; // Variables
        do {
            j = 0; // j = 0, para que cada que el primer ciclo inicie, el segundo puedo comenzar desde cero
            do {
                result = i * j; // Hacer la operación de multi y guardar en una varible
                System.out.println(" | " + j + " * " + i + " = " + result + " | "); // mostrar en pantalla
                j++; // Incrementar en +1
            }while(j <= n2); // El ciclo do while, terminará hasta que j sea mayor que el número que da el usuario
            System.out.println(" ");
            i++;
        }while(i <= n); // El ciclo do while, terminará hasta que j sea mayor que el número que da el usuario
    }
    public static void CicloWhile(int n,int n2) {
        int i = 0, j, result;
        while(i <= n) { // El ciclo while se repetirá hasta que la condición no sea verdarerá
            j = 0; // j = 0, para que cada que el primer ciclo inicie, el segundo puedo comenzar desde cero
            while(j <= n2) {
                result = i * j; // Hacer la operación de multi y guardar en una varible
                System.out.println(" | " + j + " * " + i + " = " + result + " | ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
    public static void CicloFor(int n, int n2) {
        int result; // Variable que guardará la operación entre i y j
        for (int i = 0; i <= n; i++) { // Ciclos que se repetirán hasta que cubran la cantidad de tablas y hasta
            for (int j = 0; j <= n2; j++){ // que número quiere
                result = i * j;
                System.out.println(" | " + j + " * " + i + " = " + result + " | ");
            }
            System.out.println(" ");
        }
    }
    // *************** Función principal ***************
    public static void main(String args[]){
        Scanner read = new Scanner(System.in); // Crear un objeto para leer datos del teclado
        
        System.out.println("¿Cuantas tablas quiere?");
        int n = read.nextInt(); // Leer un dato de tipo númerico
        System.out.println("¿Hasta qué número quieres que se creen las tablas?");
        int n2 = read.nextInt(); // Leer un dato de tipo númerico
        System.out.println("Ciclo For**********************************");
        CicloFor(n, n2); 
        System.out.println("Ciclo Wh// Llmar a la función del ciclo for y mandar los parámetrosile**********************************");
        CicloWhile(n, n2); // Llmar a la función del ciclo while y mandar los parámetros
        System.out.println("Ciclo Do While**********************************");
        CicloDoWhile(n,n2); // Llmar a la función del ciclo doWhile y mandar los parámetros
    }
}
