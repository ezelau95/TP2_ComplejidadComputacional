package polinomios;

public class Main {

	public static void main(String[] args) {
		
		  Polinomio polinomio;
		 double[] aux= {1,1,1,1,1};
		// TODO Auto-generated method stub
		polinomio=new Polinomio(aux);
		polinomio.evaluarPow(5);
	
		System.out.println(polinomio.evaluarPow(5));
	}

}
