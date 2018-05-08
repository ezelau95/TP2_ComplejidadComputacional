package polinomios;
/*Falta revisar otras formas de obtener los coeficientes del desarrollo completo del binomio.
 * Técnicas con y sin memorización*/

public class BinomioDeNewton {

	//considerando la fórmula (ax+b)^n
	private int a;
	private int b;
	private int n;

	public BinomioDeNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	public int terminoK(int k) {
		return (int) (Utilitario.combinatoria(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}
	
	public Polinomio desarrolloCompleto() {

			double[] coeficientes = new double[n + 1];
			for (int i = 0; i < coeficientes.length; i++) {
				coeficientes[i] = Utilitario.combinatoria(n, i) * Math.pow(a, n - i) * Math.pow(b, i);
			}
			return new Polinomio(coeficientes);
		}
	}
