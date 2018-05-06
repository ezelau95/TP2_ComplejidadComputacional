package polinomios;

public class Polinomio {
	private int grado;
	private double [] coeficientes;
	
	public Polinomio(double[] c) {
		coeficientes = c;
		grado = c.length;
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
	
	public double horner(double x) {
        double result = 0;
        for (int i = grado - 1; i >= 0; i--)
            result = coeficientes[i] + (x * result);
        return result;
    }
}
