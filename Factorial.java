public class Factorial {

 // Método recursivo para calcular el factorial
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        if (n == 0 || n == 1) {  // Caso base
            return 1;
        }
        return n * factorial(n - 1);  // Llamada recursiva
    }

    // Método main para probar la función
    public static void main(String[] args) {
        int numero = 5;
        long resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}