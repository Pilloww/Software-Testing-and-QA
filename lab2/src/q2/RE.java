package q2;
import java.util.*;
public class RE {
	public static boolean checkPhoneNumber(String s) {
		//accounts for white-space before and after the input string, between the special characters but not between the numbers 
		//eg. this is a valid format: ( xxx ) xxx - xxxx      
		return s.matches("\\s*\\(\\s*\\d{3}\\s*\\)\\s*\\d{3}\\s*-\\s*\\d{4}\\s*");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phone number: ");
		String input = sc.nextLine();
		boolean wasPhoneNum = checkPhoneNumber(input);
		System.out.println("\nThat was"+ (wasPhoneNum? "" : "n't") +" a phone number");
	}
}
