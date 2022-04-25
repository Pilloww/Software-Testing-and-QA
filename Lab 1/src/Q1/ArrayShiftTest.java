package Q1;
import java.util.Arrays;
import org.junit.Test;
import junit.framework.TestCase;

public class ArrayShiftTest extends TestCase{
	private ArrayShift as;
	private int[] inArray = {4, 6, 0, 3, 4, 5, 4, 4, 6, 2};
	public final void setUp() {
		as = new ArrayShift();
	}
	//expected resulting output after inArray goes through the shiftOne() method once
	private int[] expectedArray = {-1, 4, 6, 0, 3, 4, 5, 4, 4, 6};
	//test if resulting output from shiftOne() returns the expected result
	@Test
	public final void testShiftOne() {
		int[] outArray = as.shiftOne(inArray);
		assertTrue(Arrays.equals(expectedArray, outArray));
	}
	//test if inArray and outArray have the same array length
	@Test
	public final void testArraySize() {
		int[] outArray = as.shiftOne(inArray);
		assertEquals(inArray.length, outArray.length);
	}
}
