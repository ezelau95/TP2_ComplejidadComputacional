package polinomios;
/*Falta revisar otras formas de obtener los coeficientes del desarrollo completo del binomio.
 * Técnicas con y sin memorización*/

public class BinomioDeNewton {

	//considerando la fórmula (ax+b)^n
	private int a;
	private int b;
	private int n;
	
	public int getA() {
		return a; }
	
	public int getB() {
		return b; }
	
	public int getN() {
		return n; }

	public BinomioDeNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	public int combinatoria(int m, int n) {
		return factorial(m) / (factorial(m - n) * factorial(n));
	}

	public int factorial(int n) {
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		return f;
	}
	
	public int terminoK(int k) {
		return (int) (this.combinatoria(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}
	
public Polinomio desarrolloCompleto() {
		
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = this.combinatoria(n, i);
		}
		return new Polinomio(coeficientes);
	}
}
