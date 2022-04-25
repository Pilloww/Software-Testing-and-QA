package Q3;

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
public class TheoriesTest {

	@DataPoints
	public static Integer[] vals() {
		return new Integer[] {
				1, 2, 307, 400567
		};
	}
	@DataPoints
	public static Integer[] val() {
		return new Integer[] {
				1, 2, 307, 400567
		};
	}
	@DataPoints
	public static Integer[] newval() {
		return new Integer[] {
				0, -1, -10, -1234, 1, 10, 6789
		};
	}
	@DataPoints
	public static Integer[] newvals() {
		return new Integer[] {
				0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE
		};	
	}
	@Theory
	public void testTheories(int a, int b) throws Exception{
		System.out.println(String.format("Testing with %d and %d", a, b));
		assumeNotNull(a, b);
		assumeTrue(a>=0);
		assumeTrue(b>=0);
		boolean actual = Theoriess.theory(a, b);
		System.out.println(String.format("Actual: %b", actual));
		assertThat(actual, isA(boolean.class) );
	}

}
