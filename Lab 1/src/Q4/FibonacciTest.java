package Q4;

import org.junit.Test;
import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
	private Fibonacci fib;
	public final void setUp() {
		fib = new Fibonacci();
	}
	//test that index 6 which is the 7th number or n = 7 is '13'
	//{1,1,2,3,5,8,13,21)
	@Test
	public void test1Fibonacci() {
		int result = fib.fibonacci_iterative(7);
		assertEquals(13, result);
	}
	//test case to show 'result' is in fact the result of the 2 previous iterations of the fibonacci_iterative 
	@Test
	public void test2Fibonacci() {
		int result = fib.fibonacci_iterative(6);
		assertEquals(fib.fibonacci_iterative(4) + fib.fibonacci_iterative(5), result);
	}
	//test for the default value of the first index of 1
	@Test
	public void test3FibonacciThrowsError() {
		int result = fib.fibonacci_iterative(1);
		assertEquals(1, result);
	}
}
