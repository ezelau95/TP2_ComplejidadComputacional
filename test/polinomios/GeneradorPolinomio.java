package polinomios;

import java.util.Random;

/**
 * @author Emmanuel
 *
 */
public class GeneradorPolinomio {

	/**
	 * 
	 * @param gradoPolinomio
	 *            <code>int</code> con el grado del polinomio
	 * @param menorNumeroCoeficiente
	 *            <code>int</code> mínimo valor que podrá tomar algun coeficiente
	 * @param mayorNumeroCoeficiente
	 *            <code>int</code> máximo valor que podrá tomar algun coeficiente
	 * @return <code>double[]</code> vector con el tamaño del grado ingresado y
	 *         valores aleatorios dentro del rango ingresado
	 */
	public static double[] generarPolinomioAleatorio(int gradoPolinomio, int menorNumeroCoeficiente,
			int mayorNumeroCoeficiente) {
		double[] polinomio = new double[gradoPolinomio + 1];

		Random r = new Random();
		int rangoMinimo = menorNumeroCoeficiente;
		int rangoMaximo = mayorNumeroCoeficiente;

		for (int i = 0; i < polinomio.length; i++) {
			double coeficiente = rangoMinimo + (rangoMaximo - rangoMinimo) * r.nextDouble();
			polinomio[i] = coeficiente;
		}
		return polinomio;
	}

}
