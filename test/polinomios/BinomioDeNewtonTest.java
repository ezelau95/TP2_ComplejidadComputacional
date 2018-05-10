package polinomios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinomioDeNewtonTest {
	
	BinomioDeNewton binomioNewton1, binomioNewton2, binomioNewton3, binomioNewton4, binomioNewton5, binomioNewton6;
	Polinomio resultadoNewton1, resultadoNewton2, resultadoNewton3, resultadoNewton4, resultadoNewton5, resultadoNewton6;

	@Before
	public void setup() {

		binomioNewton1 = new BinomioDeNewton(1,-3,6);
		resultadoNewton1 = new Polinomio(new double[]{1, -18, 135, -540, 1215, -1458, 729});

		binomioNewton2 = new BinomioDeNewton(-3,2,4);
		resultadoNewton2 = new Polinomio(new double[]{81, -216, 216, -96, 16});

		binomioNewton3 = new BinomioDeNewton(3,2,4);
		resultadoNewton3 = new Polinomio(new double[]{81, 216, 216, 96, 16});

		binomioNewton4 = new BinomioDeNewton(-1,4,7);
		resultadoNewton4 = new Polinomio(new double[]{-1, 28, -336, 2240, -8960, 21504, -28672, 16384});

		binomioNewton5 = new BinomioDeNewton(1,1,2);
		resultadoNewton5 = new Polinomio(new double[]{1, 2, 1});

		binomioNewton6 = new BinomioDeNewton(1,-3,5);
		resultadoNewton6 = new Polinomio(new double[]{1, -15, 90, -270, 405, -243});
	}
	
	@Test
	public void desarrolloCompletoTest(){

		Assert.assertTrue(resultadoNewton1.equals(binomioNewton1.desarrolloCompleto()));
		Assert.assertTrue(resultadoNewton2.equals(binomioNewton2.desarrolloCompleto()));
		Assert.assertTrue(resultadoNewton3.equals(binomioNewton3.desarrolloCompleto()));
		Assert.assertTrue(resultadoNewton4.equals(binomioNewton4.desarrolloCompleto()));
		Assert.assertTrue(resultadoNewton5.equals(binomioNewton5.desarrolloCompleto()));
		Assert.assertTrue(resultadoNewton6.equals(binomioNewton6.desarrolloCompleto()));
	}

	@Test
	public void coeficienteKTest(){
		
	}
}
