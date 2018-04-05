package Operadores;

/**
 *
 * @author WASP
 */
public class OperadoresComparacion {
    public static void main(String args[]) {
        // Variables y asignación
        boolean resultado;
        int op1 = 10, op2 = 5, op3 = 15;
        resultado = op1 < op2;
        System.out.println("op1 < op2 = " + resultado);
        resultado = op3 > op1;
        System.out.println("op3 > op1 = " + resultado);
        resultado = op2 != op3;
        System.out.println("op2 != op3 = " + resultado);
    }
}
