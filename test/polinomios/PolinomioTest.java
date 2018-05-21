package polinomios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PolinomioTest {

	private Polinomio pol1, pol2, pol3;

	@Before
	public void setUp() {
		pol1 = new Polinomio(new double[] { 1, 1, 1, 1, 1 });
		pol2 = new Polinomio(new double[] { 2, 2, 2, 2, 2 });
		pol3 = new Polinomio(new double[] { 13, 45, -52, 7, -2, 6, 9 });
	}

	@Test
	public void evaluarMSucesivasTest() {
		double resultado = pol1.evaluarMSucesivas(1);
		Assert.assertEquals(5, resultado, 100000);

		resultado = pol1.evaluarMSucesivas(2);
		Assert.assertEquals(31, resultado, 100000);

		resultado = pol1.evaluarMSucesivas(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 100000) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarMSucesivas(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarMSucesivas(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 100000) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}

	@Test
	public void evaluarRecursivaTest() {
		double resultado = pol1.evaluarRecursiva(1);
		Assert.assertEquals(5, resultado, 100000);

		resultado = pol1.evaluarRecursiva(2);
		Assert.assertEquals(31, resultado, 100000);

		resultado = pol1.evaluarRecursiva(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarRecursiva(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarRecursiva(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 2) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}

	@Test
	public void evaluarRecursivaParTest() {
		double resultado = pol1.evaluarRecursivaPar(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarRecursivaPar(2);
		Assert.assertEquals(31, resultado, 0);

		resultado = pol1.evaluarRecursivaPar(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarRecursivaPar(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarRecursivaPar(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 2) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}

	@Test
	public void evaluarPowTest() {
		double resultado = pol1.evaluarPow(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarPow(2);
		Assert.assertEquals(31, resultado, 0);

		resultado = pol1.evaluarPow(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarPow(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarPow(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 2) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}

	@Test
	public void evaluarHornerTest() {
		double resultado = pol1.evaluarHorner(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarHorner(2);
		Assert.assertEquals(31, resultado, 0);

		resultado = pol1.evaluarHorner(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarHorner(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarHorner(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 2) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}

	@Test
	public void evaluarProgDinamicaTest() {
		double resultado = pol1.evaluarProgDinamica(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarProgDinamica(2);
		Assert.assertEquals(31, resultado, 0);

		resultado = pol1.evaluarProgDinamica(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarProgDinamica(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarProgDinamica(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 2) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}


	@Test
	public void evaluarMejoradaTest() {
		double resultado = pol1.evaluarMejorada(1);
		Assert.assertEquals(5, resultado, 0);

		resultado = pol1.evaluarMejorada(2);
		Assert.assertEquals(31, resultado, 0);

		resultado = pol1.evaluarMejorada(3);
		double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol2.evaluarMejorada(3);
		resultadoEsperado = Math.pow(3, 4) * 2 + Math.pow(3, 3) * 2 + Math.pow(3, 2) * 2 + Math.pow(3, 1) * 2 + 1;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);

		resultado = pol3.evaluarMejorada(27);
		resultadoEsperado = Math.pow(27, 6) * 13 + Math.pow(27, 5) * 45 + Math.pow(27, 4) * -52 + Math.pow(27, 3) * 7
				+ Math.pow(27, 2) * -2 + Math.pow(27, 1) * 6 + 9;
		Assert.assertEquals(resultadoEsperado, resultado, 100000);
	}
}
