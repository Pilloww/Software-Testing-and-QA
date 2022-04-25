package Q2;

import org.junit.Test;
import java.util.Arrays;
import junit.framework.TestCase;

public class ArrayMultTest extends TestCase{
	private ArrayMult am;
	private int[] array1 = {1, 2, 3};
	private int[] array2 = {2, 3, 4};
	private int[] array3 = {3, 4, 5, 6};
	//expected results
	private int[] arr1Xarr2 = {2, 6, 12};
	private int[] arr2Xarr3 = {6, 12, 20, 6};
	public final void setUp() {
		am = new ArrayMult();
	}
	//tests arrays of the same length
	@Test
	public void testEqualLengthArrays() {
		int[] outArray = am.mult(array1, array2);
		assertTrue(Arrays.equals(arr1Xarr2, outArray));
	}
	//tests arrays of unequal lengths
	@Test
	public void testUnequalLengthArrays() {
		int[] outArray = am.mult(array2, array3);
		assertTrue(Arrays.equals(arr2Xarr3, outArray));
	}
	//tests that length of outArray is the length of longArray
	@Test
	public void testArrayLength() {
		int[] outArray = am.mult(array2, array3);
		assertEquals(arr2Xarr3.length, outArray.length);
	}
}
