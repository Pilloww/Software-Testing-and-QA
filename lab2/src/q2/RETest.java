package q2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RETest {
//	RE phone1, phone2, phone3;
//	@Before
//	public void init() {
//		phone1 = new RE();
//		phone2 = new RE();
//		phone3 = new RE();
//	}
	//checks expected format
	@Test
	public void test1() {
		assertTrue(RE.checkPhoneNumber("(123)123-1234"));
	}
	//checks with whitespace before and after sequence
	@Test
	public void test2() {
		assertTrue(RE.checkPhoneNumber("  (123)123-1234 "));
	}
	//checks with whitespace between digits
	@Test
	public void test3() {
		assertFalse(RE.checkPhoneNumber("(123)12 3-12 34 "));
	}
	//checks for whitespace within input string but not between the digits, so it is valid
	@Test
	public void test4() {
		assertTrue(RE.checkPhoneNumber("( 123 ) 123 - 1234 "));
	}
}
