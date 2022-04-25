package Q4;

import Q1.Fibonacci;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

import org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.isA;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import junit.framework.Assert;


@RunWith(Theories.class)
public class FibonacciTheoryTest {


	@DataPoints
	public static Integer[] newvals() {
		return new Integer[] {
				1, 2, 3, 4, 5, 6, 7 , 8 , 9, 10, -10, -2331
		};	
	}
	@Theory
	public void testFibonacciTheory(int x) throws Exception{
		System.out.println(String.format("Testing with %d", x));
		assumeTrue(x>=0);
		int actual = Fibonacci.compute(x);
		System.out.println(String.format("Actual: %d", actual));
		assertThat(actual, isA(int.class) );
	}

}
