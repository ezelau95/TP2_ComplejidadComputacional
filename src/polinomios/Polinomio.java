package polinomios;

public class Polinomio {
	private int grado;
	private double [] coeficientes;
	
	public Polinomio(double[] c) {
		
			coeficientes = c;
		grado = c.length-1;
	}
	
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y la posicion n contiene al termino independiente.
	
	//grado 4: 1x4 + 1x3 + 1x2 + 1x1 + 1
	//		   0     1     2     3     4
	// x = 1 : 
	public double evaluarMSucesivas(double x) {
		
		double resultado = 0;
		double aux;
		for (int i = 0; i < grado; i++) {
			aux = x;
			for (int n = grado-i; n > 0; n--) {
				aux *= x; 
			}
			resultado += aux * coeficientes[i];
		}
		
		return resultado;
	}
	
	public double evaluarRecursiva(double x) {
		return 0;
	}
	
    /**
     *Resuelve un polinomio utilizando la funcion <i>pow</i> de la biblioteca Math. <br>
     *
     * Complejidad O(n)
     *
     * @param x  .
     */
	public double evaluarPow(double x) {
		double resultado = 0;
		for (int i = 0; i <= this.grado; i++)
			resultado += this.coeficientes[i] * Math.pow(x, this.grado - i);
		System.out.println(resultado);
		return resultado;
	}
	
	 /**
	 *Resuelve un polinomio aplicando el algoritmo de Horner de analisis numerico<br>
     *
     * Complejidad O(n)
     *
     * @param x  .
     */
	public double horner(double x) {
		double resultado = this.coeficientes[0];
		for (int i = 1; i <= this.grado; i++) {
			resultado = this.coeficientes[i] + resultado * x;
		}
		return resultado;
       
    }
}
