package Q4;

import java.util.ArrayList;

public class Fibonacci {
	public int fibonacci_iterative(int n) {
		//ArrayList used as our endless array
		ArrayList<Integer> fibs = new ArrayList<>();
		//zero-based indexing so fib: 1,1,2,3,5 will be indexes 0,1,2,3,4 respectively
		//n = 1 and n = 2 are the starting values of index 0 and 1 respectively
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			//insert initial 2 indexes into fibs ArrayList
			fibs.add(1);
			fibs.add(1);
			for(int i = 0; i < n-1; i++){
				//calculate and append the following fibonacci number to the ArrayList
				fibs.add(fibs.get(i) + fibs.get(i+1));
			}
			return fibs.get(n-1);
		}
	}
}
