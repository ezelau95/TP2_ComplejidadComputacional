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
		pol1 = new Polinomio(new double[] { 1, 1, 1, 1, 1 });
		pol2 = new Polinomio(new double[] { 2, 2, 2, 2, 2 });
	}

	@Test
	public void evaluarMSucesivasTest() {
		double resultado = pol1.evaluarMSucesivas(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarMSucesivas(2);
		Assert.assertEquals(62, resultado, 0);

	}

	@Test
	public void evaluarRecursivaTest() {
		double resultado = pol1.evaluarRecursiva(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarRecursiva(2);
		Assert.assertEquals(62, resultado, 0);

	}
	
	@Test
	public void evaluarRecursivaParTest() {
		double resultado = pol1.evaluarRecursivaPar(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarRecursivaPar(2);
		Assert.assertEquals(62, resultado, 0);

	}

	@Test
	public void evaluarHorner() {
		double resultado = pol1.horner(1);
		Assert.assertEquals(5, resultado, 0);
	}
}
