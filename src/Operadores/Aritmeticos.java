package Operadores;
/**
 *
 * @author WASP
 */
public class Aritmeticos {
    public static void main(String args[]) {
        //Variables y asignar valor
        int operador1, operador2, operador3, resultado;
        operador1 = 10; operador2 = 15; operador3 = 7;
        resultado = operador1 + operador3;
        // Operación
        System.out.println("La suma de op1 y op3 es " + resultado);
        resultado = operador1 - operador3;
        System.out.println("La resta de op1 y op3 es " + resultado);
        resultado = operador1 * operador3;
        System.out.println("La multiplicación de op1 y op3 es " + resultado);
        resultado = operador1 / operador3;
        System.out.println("La división de op1 y op3 es " + resultado);
        resultado = operador1 % operador3;
        System.out.println("El modulo de op1 y op3 es " + resultado);
    }
}
