package polinomios;
/*Falta revisar otras formas de obtener los coeficientes del desarrollo completo del binomio.
 * Técnicas con y sin memorización*/

public class BinomioDeNewton {

	// considerando la fórmula (ax+b)^n
	private int a;
	private int b;
	private int n;

	/**
	 * Constructor con parametros
	 * 
	 * @param a
	 *            <code>int</code>
	 * @param b
	 *            <code>int</code>
	 * @param n
	 *            <code>int</code>
	 */
	public BinomioDeNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}

	/**
	 * Obtener el termino k del polinomio utilizando el calculo combinatorio
	 * iterativo
	 *
	 * Complejidad
	 *
	 * @param k
	 *            <code>int</code> el termino a obtener
	 * @return termino enviado como parametro
	 */
	public int terminoK(int k) {
		return (int) (Utilitario.combinatoria(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}

	/**
	 * Obtener el termino k del polinomio utilizando el calculo combinatorio
	 * recursivo
	 *
	 * Complejidad
	 *
	 * @param k
	 *            <code>int</code> el termino a obtener
	 * @return termino enviado como parametro
	 */
	public int terminoKRecursivo(int k) {
		return (int) (Utilitario.combinatoriaRecursiva(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}

	/**
	 * Obtener el termino k del polinomio utilizando el triangulo de Tartaglia
	 *
	 * Complejidad
	 *
	 * @param k
	 *            <code>int</code> el termino a obtener
	 * @return termino enviado como parametro
	 */
	public int terminoKMejorado(int k) {
		return (int) (Utilitario.combinatoriaMejorada(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}

	/**
	 * Obtener el polinomio del desarrollo completo de un binomio de newton, el
	 * calculo combinatorio iterativo
	 * 
	 * Complejidad
	 * 
	 * @return polinomio resultante
	 */
	public Polinomio desarrolloCompleto() {

		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = Utilitario.combinatoria(n, i) * Math.pow(a, n - i) * Math.pow(b, i);
		}
		return new Polinomio(coeficientes);
	}

	/**
	 * Obtener el polinomio del desarrollo completo de un binomio de newton, el
	 * calculo combinatorio recursivo
	 * 
	 * Complejidad
	 * 
	 * @return polinomio resultante
	 */
	public Polinomio desarrolloCompletoRecursivo() {

		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = Utilitario.combinatoriaRecursiva(n, i) * Math.pow(a, n - i) * Math.pow(b, i);
		}
		return new Polinomio(coeficientes);
	}

	/**
	 * Obtener el polinomio del desarrollo completo de un binomio de newton, el
	 * calculo combinatorio mejorado con triangulo de tartaglia
	 * 
	 * Complejidad
	 * 
	 * @return polinomio resultante
	 */
	public Polinomio desarrolloCompletoMejorado() {

		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = Utilitario.combinatoriaMejorada(n, i) * Math.pow(a, n - i) * Math.pow(b, i);
		}
		return new Polinomio(coeficientes);
	}

	/**
	 * 
	 * @return n <code>int</code>
	 */
	public int getN() {
		return n;
	}

}
