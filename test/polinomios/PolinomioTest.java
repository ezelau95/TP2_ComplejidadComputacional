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
    public void evaluarRecursivaTest() {
        double resultado = pol1.evaluarRecursiva(1);
        Assert.assertEquals(5, resultado, 2);

        resultado = pol1.evaluarRecursiva(2);
        Assert.assertEquals(31, resultado, 2);

        resultado = pol1.evaluarRecursiva(3);
        double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
        Assert.assertEquals(resultadoEsperado, resultado, 2);

        resultado = pol2.evaluarRecursiva(3);
        resultadoEsperado = Math.pow(3, 4)*2 + Math.pow(3, 3)*2 + Math.pow(3, 2)*2+ Math.pow(3, 1)*2 + 1;
        Assert.assertEquals(resultadoEsperado, resultado, 2);
    }

    @Test
    public void evaluarRecursivaParTest() {
        double resultado = pol1.evaluarRecursivaPar(1);
        Assert.assertEquals(5, resultado, 0);

        resultado = pol1.evaluarRecursivaPar(2);
        Assert.assertEquals(31, resultado, 0);

        resultado = pol1.evaluarRecursivaPar(3);
        double resultadoEsperado = Math.pow(3, 4) + Math.pow(3, 3) + Math.pow(3, 2) + Math.pow(3, 1) + 1;
        Assert.assertEquals(resultadoEsperado, resultado, 2);

        resultado = pol2.evaluarRecursivaPar(3);
        resultadoEsperado = Math.pow(3, 4)*2 + Math.pow(3, 3)*2 + Math.pow(3, 2)*2+ Math.pow(3, 1)*2 + 1;
        Assert.assertEquals(resultadoEsperado, resultado, 2);
    }

	@Test
	public void evaluarHornerTest(){
		//TODO: Generar test y revisar logica
	}
}
