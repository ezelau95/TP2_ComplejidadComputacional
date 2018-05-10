package polinomios;

import java.util.Arrays;

/**
 * La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n
 *  y la posicion n contiene al termino independiente.
 * 
 *
 */
public class Polinomio {
	private int grado;
	private double[] coeficientes;
	private double[] valoresDeVariablePorGrado;
	private Double valorAEvaluar;

	public Polinomio(final double[]  c) {
		coeficientes = c;
		grado = c.length - 1;
		valoresDeVariablePorGrado = null;
		valorAEvaluar = null;
	}

	/**
	 * Evalua el polinomio calculando las potencias del mismo aplicando multiplicaciones sucesivas
	 * 
	 * Complejidad O(f(n^2))
	 * 
	 * @param x numero con el cual se va a evaluar el polinomio
	 * @return resultado del polinomio
	 */
	public synchronized double evaluarMSucesivas(double x) {

		double resultado = 0;
		double aux;
		for (int i = 0; i < coeficientes.length; i++) {
			aux = 1;
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
	 * @param x numero con el cual se va a evaluar el polinomio
	 * @return el resultado del polinomio
	 */
	public synchronized double evaluarRecursiva(double x) {
		double resultado = 0;
		for (int i = 0; i < this.grado; i++) {
			resultado += this.coeficientes[i] * Utilitario.potencia(x, this.grado - i);
		}
		return resultado;
	}

	/**
	 * Evalua el polinomio de manera recursiva considerando si el exponente es par o
	 * impar.Complejidad O(f(n^2*2^n*log*n))
	 *
	 * @param 	x numero con el cual se va a evaluar el polinomio
	 * @return	el resultado del polinomio
	 */
	public double evaluarRecursivaPar(double x) {
		double resultado = 0;
		for (int i = 0; i <= this.grado; i++) {
			resultado += this.coeficientes[i] * Utilitario.potenciaParImpar(x, this.grado - i);
		}
		return resultado;
	}

	 /**
     *Resuelve un polinomio utilizando la funcion pow de la biblioteca Math.
     *
     * Complejidad O(f(n))
     *
     * @param x numero con el cual se va a evaluar el polinomio
     * @return 	el resultado del polinomio
     */
	public double evaluarPow(double x) {
		double resultado = 0;
		for (int i = 0; i <= this.grado; i++)
			resultado += this.coeficientes[i] * Math.pow(x, this.grado - i);
		System.out.println(resultado);
		return resultado;
	}
	
	/**
	 * Resuelve un polinomio aplicando el algoritmo de Horner de analisis numerico
     *
     * Complejidad O(f(n))
     * 
     * @param x numero con el cual se va a evaluar el polinomio
     * @return 	el resultado del polinomio
     */
	public double evaluarHorner(double x) {
		double resultado = this.coeficientes[0];
		for (int i = 1; i <= this.grado; i++) {
			resultado = this.coeficientes[i] + resultado * x;
		}
		return resultado;
       
    }
	
	/**
	 * Evalua el polinomio realizando el calculo de las potencias de la variable de forma dinamica,
	 * obtiene el valor del la proxima potencia en base a la anterior
	 * 
	 * Complejidad O(f(n))
	 * 
	 * @param x numero con el cual se va a evaluar el polinomio
     * @return 	el resultado del polinomio
	 */
	public double evaluarProgDinamica(double x) {
		
		//inicializo en termino independiente
		double resultado = coeficientes[grado];
		
		if (valorAEvaluar == null || x != valorAEvaluar) {
			valorAEvaluar = x;
			//La posicion 0 del vector tiene el calculo de x^n, siendo n el grado
			valoresDeVariablePorGrado = new double[grado];
			if (valorAEvaluar == 0) {
				return resultado;
			}
			//Completo el ultimo valor con x^1
			valoresDeVariablePorGrado[grado-1] = x;
		}
		
		//cargo vector con valores de la variable en todos sus grados
		for (int i = grado-2; i >= 0; i--) {
			if (valoresDeVariablePorGrado[i] == 0) {
				valoresDeVariablePorGrado[i] = valorAEvaluar * valoresDeVariablePorGrado[i+1];
			}
		}
		
		for (int i = 0; i < grado; i++) {
			resultado += coeficientes[i] * valoresDeVariablePorGrado[i];
		}
		
		return resultado;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Polinomio polinomio = (Polinomio) o;

		if (grado != polinomio.grado)
			return false;
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
		return "Polinomio{" + "coeficientes=" + Arrays.toString(coeficientes) + '}';
	}

	public int getGrado() {
		return grado;
	}
}
