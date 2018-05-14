package polinomios;

import org.junit.Assert;
import org.junit.Test;

public class UtilitarioTest {

    @Test
    public void factorialTest() {
        Assert.assertEquals(1, Utilitario.factorial(0));
        Assert.assertEquals(1, Utilitario.factorial(1));
        Assert.assertEquals(2, Utilitario.factorial(2));
        Assert.assertEquals(6, Utilitario.factorial(3));
        Assert.assertEquals(720, Utilitario.factorial(6));
    }

    @Test
    public void combinatoriaRecursivaTest() {
        Assert.assertEquals(1, Utilitario.combinatoriaRecursiva(6, 0));
        Assert.assertEquals(6, Utilitario.combinatoriaRecursiva(6, 1));
        Assert.assertEquals(15, Utilitario.combinatoriaRecursiva(6, 2));
        Assert.assertEquals(1, Utilitario.combinatoriaRecursiva(6, 6));
    }

    @Test
    public void combinatoriaTest() {
        Assert.assertEquals(1, Utilitario.combinatoria(6, 0));
        Assert.assertEquals(6, Utilitario.combinatoria(6, 1));
        Assert.assertEquals(15, Utilitario.combinatoria(6, 2));
        Assert.assertEquals(1, Utilitario.combinatoria(6, 6));
    }

    @Test
    public void combinatoriaTrianguloPascalTest(){
        Assert.assertEquals(1, Utilitario.combinatoriaMejorada(6, 0));
        Assert.assertEquals(6, Utilitario.combinatoriaMejorada(6, 1));
        Assert.assertEquals(15, Utilitario.combinatoriaMejorada(6, 2));
        Assert.assertEquals(1, Utilitario.combinatoriaMejorada(6, 6));
    }

    @Test
    public void potenciaTest(){
        Assert.assertEquals(Math.pow(2, 5), Utilitario.potencia(2, 5), 100000000);
        Assert.assertEquals(Math.pow(5, 10), Utilitario.potencia(5, 10), 100000000);
        Assert.assertEquals(Math.pow(-17, 13), Utilitario.potencia(-17, 13), 100000000);
    }

    @Test
    public void potenciaParImparTest(){
        Assert.assertEquals(Math.pow(2, 5), Utilitario.potenciaParImpar(2, 5), 100000000);
        Assert.assertEquals(Math.pow(5, 10), Utilitario.potenciaParImpar(5, 10), 100000000);
        Assert.assertEquals(Math.pow(-17, 13), Utilitario.potenciaParImpar(-17, 13), 100000000);
    }
}
