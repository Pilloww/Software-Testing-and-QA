package coe_891_lab6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;

public class TriclassTest {
	private final String scalene = "Scalene triangle";
	private final String isosceles = "Isosceles triangle";
	private final String equalateral = "Equalateral triangle";
	private final String notTri = "Not a valid triangle";
	public static int counter = 0;
	@BeforeClass
	public static void init() {
	}
	@BeforeClass
	public static void start() {
		System.out.println("Testing started");
	}
	@AfterClass
	public static void finish() {
		System.out.println("Testing is finished");
	}
	@Before
	public void beforeTests() {
		counter++;
		System.out.println("Test " + counter + " - started");
	}
	@After
	public void afterTests() {
		System.out.println("Test " + counter + " - is finished");
	}
	//outside lower bound
	@Test
	public void outLower() {
		System.out.println("Classifying Triangle (0,5,5) - outside lower bounds");
		assertEquals(notTri, Triclass.classify(0,5,5));
	}
	//minimum
	@Test
	public void min() {
		System.out.println("Classifying Triangle (1,1,1) - minimum value");
		assertEquals(equalateral, Triclass.classify(1,1,1));
	}
	//just above minimum
	@Test
	public void aboveMin() {
		System.out.println("Classifying Triangle (2,5,2) - just above minimum value");
		assertEquals(notTri, Triclass.classify(2,5,2));
	}
	//nominal value
	@Test
	public void nominal() {
		System.out.println("Classifying Triangle (2,4,5) - nominal value");
		assertEquals(scalene, Triclass.classify(2,4,5));
	}
	//below max
	@Test
	public void belowMax() {
		System.out.println("Classifying Triangle (3,5,9) - just below maximum value");
		assertEquals(notTri, Triclass.classify(3,5,9));
	}
	//max value
	@Test
	public void Max() {
		System.out.println("Classifying Triangle (10,1,10) - maximum value");
		assertEquals(isosceles, Triclass.classify(10,1,10));
	}
	//above max
	@Test
	public void aboveMax() {
		System.out.println("Classifying Triangle (11,3,5) - just above maximum value");
		assertEquals(notTri, Triclass.classify(11,4,5));
	}

}
