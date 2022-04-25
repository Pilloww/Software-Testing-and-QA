package Q2;

public class ArrayMult {

	public int[] mult(int[] array1, int[] array2) {
		//Determine min length array
		//if arrays are equal, minlen will be set to array1 (as it won't matter which is chosen when equal)
		//Determine which is the shortArray and longArray
		//somewhat extra/redundant but will enable us to do less work when constructing the outArray since we will be doing the comparison anyways
		//Could simply use the "outArray" to hold the longArray so less variables are used
		//but separated them for the purpose of reading-clarity
		int minlen;
		int[] shortArray;
		int[] longArray;
		int[] outArray;
		if(array1.length <= array2.length) {
			minlen = array1.length;
			shortArray = array1.clone();
			longArray = array2.clone();
		}
		else {
			minlen = array2.length;
			shortArray = array2.clone();
			longArray = array1.clone();
		}
		outArray = longArray.clone();
		//do point-wise multiplication
		for(int i = 0; i < minlen; i++) {
			outArray[i] = shortArray[i] * longArray[i];
		}
		return outArray;
	}

}
