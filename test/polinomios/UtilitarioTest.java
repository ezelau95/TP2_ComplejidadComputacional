package polinomios;

import org.junit.Assert;
import org.junit.Test;

public class UtilitarioTest {

    @Test
    public void factorialTest() {
        Assert.assertEquals(Utilitario.factorial(0), 1);
        Assert.assertEquals(Utilitario.factorial(1), 1);
        Assert.assertEquals(Utilitario.factorial(2), 2);
        Assert.assertEquals(Utilitario.factorial(3), 6);
        Assert.assertEquals(Utilitario.factorial(6), 720);

    }

    @Test
    public void combinatoriaRecursivaTest() {
        Assert.assertEquals(Utilitario.combinatoriaRecursiva(6, 0), 1);
        Assert.assertEquals(Utilitario.combinatoriaRecursiva(6, 1), 6);
        Assert.assertEquals(Utilitario.combinatoriaRecursiva(6, 2), 15);
        Assert.assertEquals(Utilitario.combinatoriaRecursiva(6, 6), 1);

    }

    @Test
    public void potenciaTest(){
        Assert.assertEquals(Math.pow(2, 5), Utilitario.potencia(2, 5), 100000000);
        Assert.assertEquals(Math.pow(5, 10), Utilitario.potencia(5, 10), 100000000);
        Assert.assertEquals(Math.pow(-17, 13), Utilitario.potencia(-17, 13), 100000000);
    }
}
