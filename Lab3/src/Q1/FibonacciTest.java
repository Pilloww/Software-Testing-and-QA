package Q1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class FibonacciTest {
	private int x;
	private int expected;
	
	public FibonacciTest(int x, int expected) {
		this.x = x;
		this.expected = expected;
	}
	@Parameterized.Parameters(name = "{index}: compute({0})={1}")
	public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{1, 1},
			{2, 1},
			{3, 2},
			{4, 3},
			{5, 5},
			{6, 8},
			{7, 13},
			{8, 21},
			{9, 34},
			{10, 55}
		});
	}
	
	@Test
	public void testFibonacci() throws Exception{
		int actual = Fibonacci.compute(x);
		assertEquals(expected, actual);
	}
}
