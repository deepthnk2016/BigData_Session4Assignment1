package com.acadgild;

/**
 * 
 * Overloading Demo Class having a function sum two times. 
 * One accepts two int type parameters. 
 * The other one accepting three int type parameters.
 *
 */
public class OverloadingDemo {

	int sumResult;

	void sum(int a, int b) {
		System.out.println("In function (int,int)");
		this.sumResult = a + b;
	}

	void sum(int a, int b, int c) {
		System.out.println("In function (int,int,int)");
		this.sumResult = a + b + c;
	}

	void displaySum() {
		System.out.println(this.sumResult);
	}

}
