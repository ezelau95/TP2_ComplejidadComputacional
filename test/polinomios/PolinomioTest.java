package polinomios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PolinomioTest {
	
	private Polinomio pol1;
	private Polinomio pol2;
	private Polinomio pol3;
	
	@Before
	public void setUp() {
		pol1 = new Polinomio(new double[] {1, 1, 1, 1, 1});
		pol2 = new Polinomio(new double[] {2, 2, 2, 2, 2});
	}

	//grado 4: 1x4 + 1x3 + 1x2 + 1x1 + 1
	//		   0     1     2     3     4
	@Test
	public void evaluarMSucesivasTest(){
		double resultado = pol1.evaluarMSucesivas(1);
		Assert.assertEquals(5, resultado, 2);
		
		resultado = pol1.evaluarMSucesivas(2);
		Assert.assertEquals(31, resultado, 2);

		resultado = pol1.evaluarMSucesivas(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 2);

		resultado = pol2.evaluarMSucesivas(3);
		resultadoEsperado = Math.pow(3, 4)*2 + Math.pow(3, 3)*2 + Math.pow(3, 2)*2+ Math.pow(3, 1)*2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 2);
	}
	
	@Test
	public void evaluarHornerTest(){
		double resultado = pol1.evaluarHorner(1);
		Assert.assertEquals(5, resultado, 0);
	}
}
