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

    public static double potencia(double x, int n) {
        if (n > 1)
            return x * potencia(x, n - 1);
        else if (n == 1)
            return x;
        else
            return 1;
    }
    
    public static double potenciaParImpar(double x, int n) {

		if (n > 1) {
			if (n % 2 == 0) {
				return potenciaParImpar(x * x, n / 2);
			} else {
				return x * potenciaParImpar(x, n - 1);
			}
		} else if (n == 1) {
			return x;
		} else {
			return 1;
		}
	}

}
