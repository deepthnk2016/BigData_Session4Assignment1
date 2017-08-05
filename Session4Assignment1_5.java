package com.acadgild;

import java.util.Scanner;

/**
 * 
 * Class to accept a number from user and display its 10 multiples.
 *
 */
public class Session4Assignment1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		sc.close();
	}

}
