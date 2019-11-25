package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
		int num= 13;
		
		// Declare a boolean input as flag
		boolean flag = false;

		// Iterate from 1 to half of the input
		for (int i = 1; i <= num/2; i++) {
			if(num % i == 0)
			{
				flag = true;
				break;
			}
			
		}
		if (!flag)
			System.out.println(num+ "is not a prime number");
		else
			System.out.println(num+ "is a prime number");
		
		
	}
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
		
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
}
