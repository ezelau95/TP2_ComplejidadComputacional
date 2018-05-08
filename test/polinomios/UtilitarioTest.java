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
    public void combinatoriaTest() {
        Assert.assertEquals(Utilitario.combinatoria(6, 0), 1);
        Assert.assertEquals(Utilitario.combinatoria(6, 1), 6);
        Assert.assertEquals(Utilitario.combinatoria(6, 2), 15);

    }
}
