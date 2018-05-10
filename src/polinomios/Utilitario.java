package polinomios;

public class Utilitario {

	public static int combinatoriaRecursiva(int n, int k) {
		if (n >= 0 && k == 0)
			return 1;
		if (k >= 0 && n == 0)
			return 0;
		return combinatoriaRecursiva(n - 1, k - 1) + combinatoriaRecursiva(n - 1, k);
	}

	public static long combinatoria(int n, int k) {
		if (n >= 0 && k == 0)
			return 1;
		if (k >= 0 && n == 0)
			return 0;
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
		int n = 0, p = 0, aux = m - c;
		for (int i = 2; i <= m; i++) {
			n *= i;
		}

		for (int i = 2; i <= c; i++) {
			p *= i;
		}

		for (int i = 2; i < aux; i++) {
			aux *= i;
		}
		if (p == 0 || aux == 0)
			return 0;
		return n / p * aux;
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

	public static long trianguloDePascal(int nfilas, int m) {

		int combinatoria = 0;
		//int[] a = new int[1];
		
		int[][] triangulo = new int[nfilas + 1][nfilas + 1];
		int i;
		for (i = 0; i < nfilas; i++) {
			triangulo[i][i] = 1;
			triangulo[i][0] = 1;
		}
		
		for (int j = 0; j < i; j++) {
			if (j == 0 || j == (i - 1)) {
				triangulo[i][j] = 1;
			} else {
				triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
			}
			System.out.print(triangulo[i][j] + " ");

		}
		
		if (i == nfilas) {
			combinatoria = triangulo[i][m];
		}

		System.out.println();

		return combinatoria;
	}
	
	
//	public static long combDinamica(int nfilas, int m) {
//
//        //int nfilas = 10;
//        int[] a = new int[1];
//        for (int i = 1; i <= nfilas; i++) {
//            int[] x = new int[i];
//            for (int j = 0; j < i; j++) {
//                if (j == 0 || j == (i - 1)) {
//                    x[j] = 1;
//                } else {
//                    x[j] = a[j] + a[j - 1];
//                }
//                System.out.print(x[j] + " ");
//            }
//            a = x;
//            System.out.println();
//        }
//    
//	}

}
