package com.acadgild;

/**
 * Display the list of even numbers and odd numbers between two numbers 
entered by user;
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Session4Assignment1_4 {

	public static void main(String[] args) {

		ArrayList<Object> evenArray = new ArrayList<>();
		ArrayList<Object> oddArray = new ArrayList<>();

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number:");
		int firstNumber = sc.nextInt();
		System.out.println("=================================");
		System.out.println("Enter Second Number:");
		int secondNumber = sc.nextInt();

		for (int i = firstNumber; i <= secondNumber; i++) {
			// Push even numbers to ArrayList
			if (i % 2 == 0) {
				evenArray.add(i);
			} // Push odd numbers to ArrayList
			else {
				oddArray.add(i);
			}
		}
		System.out.println("=================================");
		System.out.println("Even Numbers List:");
		if (evenArray.isEmpty() == false) {
			System.out.println(evenArray);
		}
		System.out.println("=================================");
		System.out.println("Odd Numbers List:");
		if (oddArray.isEmpty() == false) {
			System.out.println(oddArray);
		}
		sc.close();
	}

}
