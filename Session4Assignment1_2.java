package com.acadgild;

/**
 * Class to accept two numbers as input from use and two display their sum.
 */
import java.util.Scanner;

public class Session4Assignment1_2 {

	public static void main(String[] args) {
		int firstNumber, secondNumber, sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		firstNumber = sc.nextInt();

		System.out.println("Enter Second Number");
		secondNumber = sc.nextInt();

		sum = firstNumber + secondNumber;

		System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);

		sc.close();
	}

}
