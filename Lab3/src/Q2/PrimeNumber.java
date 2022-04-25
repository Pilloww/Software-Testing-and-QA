package Q2;

import java.lang.Math;

public class PrimeNumber {
	public static boolean isPrime(int number) {
		int temp = number;
		int sum = 0;
		double root;
		//Check if numbers end with evens (0,2,4,6,8) or 5 - return false
		int last_digit = number%10;
		if(last_digit == 0 || last_digit == 2 || last_digit == 4 || last_digit == 6 || last_digit == 8 || last_digit == 5) {
			return false;
		}
		//Check if sum of digits are divisible by 3 - return false
		while(temp>0) {
			sum = sum + (temp%10);
			temp = temp/10;
		}
		if(sum % 3 == 0) {
			return false;
		}
		//Check if number is divisible by any primes below its square root - return false
		root = Math.sqrt(number);
		temp = (int) root;
		if(root > temp) {
			temp = temp + 1;
			for(int i = 2; i <= temp; i++) {
				if(helper(i)) {
					if(number % i == 0) {
						return false;
					}
				}
			}
		}
		if(root == (double)temp) {
			for(int i = 2; i <= temp; i++) {
				if(helper(i)) {
					if(number % i == 0) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	//helper function to determine if the number is prime... oh... just realized this was redundant but will keep it annyways since it works
	public static boolean helper(int n) {
		if (n <= 1)
		    return false;
		for (int i = 2; i < n; i++)
		    if (n % i == 0)
		        return false;
		return true;
	}	

}
