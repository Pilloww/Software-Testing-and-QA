package Q2;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Q1.Fibonacci;

@RunWith(value = Parameterized.class)
public class PrimeNumberTest {

	private int x;
	private boolean expected;
	
	public PrimeNumberTest(int x, boolean expected) {
		this.x = x;
		this.expected = expected;
	}
	@Parameterized.Parameters(name = "{index}: isPrime({0})={1}")
	public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{2, false},
			{6, false},
			{19, true},
			{22, false},
			{23, true},
		});
	}
	
	@Test
	public void testPrimeNumber() throws Exception{
		boolean actual = PrimeNumber.isPrime(x);
		assertEquals(expected, actual);
	}

}
