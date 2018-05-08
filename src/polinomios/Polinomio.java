package polinomios;

import java.util.Arrays;

public class Polinomio {
	private int grado;
	private double [] coeficientes;
	
	public Polinomio(double[] c) {
		coeficientes = c;
		grado = c.length - 1;
	}
	
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la posicion n contiene al termino independiente.

	//grado 4: 1x4 + 1x3 + 1x2 + 1x1 + 1
	//		   0     1     2     3     4
	// x = 1 :
	public double evaluarMSucesivas(double x) {

		double resultado = 0;
		double aux;
		for (int i = 0; i < coeficientes.length; i++) {
			aux = 1;
			for (int n = grado-i; n > 0; n--) {
				aux *= x; 
			}
			resultado += aux * coeficientes[i];
		}

		return resultado;
	}

	/**
	 * Evalua el polinomio de manera recursiva Sin considerar si el exponente es par
	 * o impar
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
	 * impar
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
	
	public double evaluarHorner(double x) {
        double result = 0;
        for (int i = grado - 1; i >= 0; i--)
            result = coeficientes[i] + (x * result);
        return result;
    }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Polinomio polinomio = (Polinomio) o;

		if (grado != polinomio.grado) return false;
		return Arrays.equals(coeficientes, polinomio.coeficientes);
	}

	@Override
	public int hashCode() {
		int result = grado;
		result = 31 * result + Arrays.hashCode(coeficientes);
		return result;
	}

	@Override
	public String toString() {
		return "Polinomio{" +
				"coeficientes=" + Arrays.toString(coeficientes) +
				'}';
	}
}
