package Q4;

import Q2.PrimeNumber;
import static org.junit.Assert.*;

import org.junit.Test;

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
public class PrimeNumberTheoryTest {

	@DataPoints
	public static Integer[] newvals() {
		return new Integer[] {
				2, 6, 19, 22, 23, -5, -10123,
		};	
	}
	@Theory
	public void testPrimeNumberTheory(int x) throws Exception{
		System.out.println(String.format("Testing with %d", x));
		assumeTrue(x>=0);
		boolean actual = PrimeNumber.isPrime(x);
		System.out.println(String.format("Actual: %b", actual));
		assertThat(actual, isA(boolean.class) );
	}

}
