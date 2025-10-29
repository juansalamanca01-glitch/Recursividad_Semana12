public class SumaNumeros {
    
    // Método que suma de 1 a num usando un bucle
    public static int sumaDe1AN(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        return suma;
    }

    // Método main para probar
    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumaDe1AN(numero);
        System.out.println("La suma de 1 a " + numero + " es: " + resultado);
        // Salida esperada: La suma de 1 a 5 es: 15
    }
}