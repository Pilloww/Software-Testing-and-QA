package Q3;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import junit.framework.TestCase;

public class CalculationTest extends TestCase{
//	private Calculation calc;
	private int[] inputArray1 = {-12, -3, -4, -2};
	private int[] inputArray2 = {100,-4, 101};
	private int cube1 = 3;
	private int cube2 = -2;
//	public final void setUp() {
//		calc = new Calculation();
//	}
	
	//methods for printing before/after classes and tests
	@BeforeClass 
	public void printBeforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass 
	public void printAfterClass() {
		System.out.println("After Class");
	}
	@Before
	public void printBeforeTest() {
		System.out.println("Before Test");
	}
	@After
	public void printAfterTest() {
		System.out.println("After Test");
	}
	//Tests if the findMax method functions as intended
	@Test
	public void test1FindMax() {
		int max = Calculation.findMax(inputArray1);
		assertEquals(-2, max);
	}
	@Test
	public void test2FindMax() {
		int max = Calculation.findMax(inputArray2);
		assertEquals(101, max);		
	}
	@Test
	public void test1Cube() {
		int cubed = Calculation.cube(cube1);
		assertEquals( 27, cubed);
	}
	@Test
	public void test2Cube() {
		int cubed = Calculation.cube(cube2);
		assertEquals( -8, cubed);		
	}	

}
