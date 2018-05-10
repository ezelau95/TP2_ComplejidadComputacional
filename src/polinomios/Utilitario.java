package polinomios;

public class Utilitario {

    public static int combinatoriaRecursiva(int n, int k) {
    	 if (n >= 0 && k == 0) return 1;
         if (k >= 0 && n == 0) return 0;
         return combinatoriaRecursiva(n - 1, k - 1) + combinatoriaRecursiva(n - 1, k);
    }
    
    public static int combinatoria(int n, int k) {
   	 	if (n >= 0 && k == 0) return 1;
        if (k >= 0 && n == 0) return 0;
        return factorial(n) / (factorial(n - k) * factorial(k));
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
