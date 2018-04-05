package TablasMulti;

import java.util.Scanner; // Importar la librería para poder leer datos del teclado 
/**
 *
 * @author WASP
 */
public class Tablas {
    public static void CicloDoWhile(int n, int n2){
        int i = 0,j, result;
        do {
            j = 0;
            do {
                result = i * j;
                System.out.println(" | " + j + " * " + i + " = " + result + " | ");
                j++;
            }while(j <= n2);
            System.out.println(" ");
            i++;
        }while(i <= n);
    }
    public static void CicloWhile(int n,int n2) {
        int i = 0, j, result;
        while(i <= n) {
            j = 0;
            while(j <= n2) {
                result = i * j;
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
    public static void main(String args[]){
        Scanner read = new Scanner(System.in); // Crear un objeto para leer datos del teclado
        
        System.out.println("¿Hasta qué número quieres que se creen las tablas?");
        int n = read.nextInt(); // Leer un dato de tipo númerico
        System.out.println("¿Cuantas tablas quiere?");
        int n2 = read.nextInt(); // Leer un dato de tipo númerico
        //System.out.println("Ciclo For**********************************");
        //CicloFor(n, n2);
        //System.out.println("Ciclo While**********************************");
        //CicloWhile(n, n2);
        System.out.println("Ciclo Do While**********************************");
        CicloDoWhile(n,n2);
    }
}
