package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		
		Arrays.sort(data);
		for (int i = data[0]; i <= data.length; i++) {
			if(i!= data[i-data[0]]) {
				System.out.println(i+ " is Missing element ");
				break;
			}
				
			
		}
		
		
		
		
		// Print the second largest number	
		
		
	}

}
