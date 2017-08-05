package com.acadgild;

/**
 * 
 * Program to sort out an array in descending order.
 *
 */

public class Session4Assignment1_8 {

	public static void main(String[] args) {
		// Instantiate and populate array with numbers
		int[] numberArray = { 4, 21, 5, 6, 30, 50 };
		int temp;

		System.out.println("Original Contents of Array");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
		System.out.println("================================");
		// first loop
		for (int i = 0; i < numberArray.length; i++) {
			// second loop - compare the element in the second loop with the first loop
			// if the second element is greater then interchange the position.
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[j] > numberArray[i]) {
					temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}

		// After sorting display the contents of the array
		System.out.println("Contents of Array after sorting");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
	}

}
