package q1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

//import junit.framework.TestCase;


public class TriangleTest{
	Triangle tri1, tri2, tri3, tri4, tri5;
	@Before
	public void init() {
		tri1 = new Triangle(3, 4, 5);
		tri2 = new Triangle(5, 4, 3);
		tri3 = new Triangle(8, 5 ,5);
		tri4 = new Triangle(3, 4, 100);
		tri5 = new Triangle(-2, -3, -5);
	}
	public boolean checkTriangle(Triangle triangle) {
		//triangle inequality theorem which is used to determine if 3 given side-lengths can form a triangle
		if((triangle.side1 + triangle.side2) > triangle.side3 && (triangle.side1 + triangle.side3) > triangle.side2 && (triangle.side2 + triangle.side3) > triangle.side1) {
			return true;
		}
		else {
			return false;
		}
	}
	//testing each triangle vs their expected values
	@Test
	public void testArea1() {
		assertEquals(6.0, tri1.calculateArea(), 0);
	}
	@Test
	public void testArea2() {
		assertEquals(6.0, tri2.calculateArea(), 0);
	}
	@Test
	public void testArea3() {
		assertEquals(12.0, tri3.calculateArea(), 0);
	}
	@Test
	public void testT1T2() {
		assertEquals(tri1.calculateArea(), tri2.calculateArea(), 0);
	}
	//function to return a boolean dependind on the sign of the area
	public boolean signcheck(double i) {
		if(i >= 0) return true;
		else {
			return false;
		}
	}
	@Test
	public void testPositive() {
		assertTrue(signcheck(Math.signum(tri1.calculateArea())));		
	}
	@Test
	public void testNegative() {
		assertFalse(signcheck(-Math.signum(tri1.calculateArea())));
	}
	//the testing if the triangle is possible could be used prior to testing the other tests
	@Test 
	public void testIfTrianglePossible() {
		assertFalse(checkTriangle(tri4));
	}
	//test for the negative input of side-length of a triangle which is not valid, 0 is also not a valid input
	//if statement to test an individual test case of tri5
	//better method would be have try catch block in the triangle.java file but this method is simpler and faster to implement
	@Test 
	public void testNegativeSideLengths() {
		boolean check = true;
		if(tri5.side1 <= 0 || tri5.side2 <= 0 || tri5.side3 <= 0) {
			check = false;
		}
		assertFalse(check);
	}
}
