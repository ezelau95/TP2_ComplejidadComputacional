package polinomios;

public class Utilitario {

    public static int combinatoriaRecursiva(int n, int k) {
    	 if (n >= 0 && k == 0) return 1;
         if (k >= 0 && n == 0) return 0;
         return combinatoriaRecursiva(n - 1, k - 1) + combinatoriaRecursiva(n - 1, k);
    }
    
    public static long combinatoria(int n, int k) {
   	 	if (n >= 0 && k == 0) return 1;
        if (k >= 0 && n == 0) return 0;
        return factorial(n) / (factorial(n - k) * factorial(k));
   }

    public static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    
    public int combinatoriaSinFactorial(int m, int c) {
		int n=0,p=0,aux=m-c;
		for (int i = 2; i <= m; i++) {
			n *= i;
		}
		
		for (int i = 2; i <= c; i++) {
			p *= i;
		}
		
		for (int i=2; i<aux;i++) {
			aux*=i;
		}
		if(p==0 || aux==0)
			return 0;
		return n/p*aux;
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
