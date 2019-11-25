package day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		// Here is the input
		int[] data = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };
		int count;

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Loop through each
		 * array item 3) If the consecutive array items are same -> then print as
		 * duplicates
		 */
		Arrays.sort(data);
		for (int i = 0; i <= data.length; i++) {
			count = 1;
			for (int j = i+1; j < data.length; j++) {
				if (data[i] == data[j]) {
					count++;
				}
				
			}
			if (count > 1) {
				System.out.println(data[i] + " is the duplicate no");
			}
		}

		// Print the second largest number

	}

}
