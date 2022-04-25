package Q1;
public class ArrayShift {
	
	public int[] shiftOne(int[] inArray) {
	    //make a copy of inArray to be used as output 
		//alternatively outArray could be made using array length of inArray as original values of outArray do not matter
		int[] outArray = inArray.clone();
		//replace value of index 0 of outArray with -1
		outArray[0] = -1;
		//loop through inArray and replace values of outArray with inArray starting at index 1
		for (int i = 1; i < inArray.length; i++) {
			outArray[i] = inArray[i-1];
		}
		return outArray;
	}
}
