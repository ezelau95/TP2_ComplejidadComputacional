package polinomios;

public class Polinomio {
	private int grado;
	private double[] coeficientes;

	public Polinomio(double[] c) {
		coeficientes = c;
		grado = c.length;
	}

	// La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n
	// y la posicion n contiene al termino independiente.

	// grado 4: 1x4 + 1x3 + 1x2 + 1x1 + 1
	// 0 1 2 3 4
	// x = 1 :
	public double evaluarMSucesivas(double x) {

		double resultado = 0;
		double aux;
		for (int i = 0; i < grado; i++) {
			aux = x;
			for (int n = grado - i; n > 0; n--) {
				aux *= x;
			}
			resultado += aux * coeficientes[i];
		}

		return resultado;
	}

	/**
	 * Evalua el polinomio de manera recursiva Sin considerar si el exponente es par
	 * o impar. Complejidad O(f(n^2*2^n))
	 * 
	 * @param x
	 *            numero con el cual se va a evaluar el polinomio
	 * @return el resultado del polinomio
	 */
	public double evaluarRecursiva(double x) {
		double resultado = 0;
		for (int i = 0; i < this.grado; i++) {
			resultado += this.coeficientes[i] * potencia(x, this.grado - i);
		}
		return resultado;
	}

	private double potencia(double x, int n) {
		if (n > 1)
			return x * potencia(x, n - 1);
		else if (n == 1)
			return x;
		else
			return 1;
	}

	/**
	 * Evalua el polinomio de manera recursiva considerando si el exponente es par o
	 * impar.Complejidad O(f(n^2*2^n*log*n))
	 * 
	 * @param x
	 *            numero con el cual se va a evaluar el polinomio
	 * @return
	 */
	public double evaluarRecursivaPar(double x) {
		double resultado = 0;
		for (int i = 0; i < this.grado; i++) {
			resultado += this.coeficientes[i] * potenciaParImpar(x, this.grado - i);
		}
		return resultado;
	}

	private double potenciaParImpar(double x, int n) {
		
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

	public double horner(double x) {
		double result = 0;
		for (int i = grado - 1; i >= 0; i--)
			result = coeficientes[i] + (x * result);
		return result;
	}
}
