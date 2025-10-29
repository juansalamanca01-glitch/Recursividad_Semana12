public class Fibonacci {

    public static long fibonacciIterativo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0; 
        long b = 1; 
        long c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b; 
            a = b;     
            b = c;     
        }
        return c;
    }

    public static long fibonacciRecursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;

        long fibIter = fibonacciIterativo(n);
        long fibRec = fibonacciRecursivo(n);

        System.out.println("Elemento " + n + " de Fibonacci (iterativo): " + fibIter);
        System.out.println("Elemento " + n + " de Fibonacci (recursivo): " + fibRec);
    }
}