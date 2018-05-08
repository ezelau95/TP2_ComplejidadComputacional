package polinomios;

public class Utilitario {

    public static int combinatoria(int m, int n) {
        return factorial(m) / (factorial(m - n) * factorial(n));
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
