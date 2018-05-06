package polinomios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinomioDeNewtonTest {
	
	BinomioDeNewton binomioNewton;
	
	@Before
	public void setup() {
		binomioNewton = new BinomioDeNewton(1,1,2);
	}
	
	@Test
	public void testFactorial() {
		Assert.assertEquals(binomioNewton.factorial(0), 1);
		Assert.assertEquals(binomioNewton.factorial(1), 1);
		Assert.assertEquals(binomioNewton.factorial(2), 2);
		Assert.assertEquals(binomioNewton.factorial(3), 6);
		Assert.assertEquals(binomioNewton.factorial(6), 720);
		
	}

	@Test
	public void testCombinatoria() {
		Assert.assertEquals(binomioNewton.combinatoria(6, 0), 1);
		Assert.assertEquals(binomioNewton.combinatoria(6, 1), 6);
		Assert.assertEquals(binomioNewton.combinatoria(6, 2), 15);
		
	}
}
