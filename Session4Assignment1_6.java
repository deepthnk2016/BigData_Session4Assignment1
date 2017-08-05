package com.acadgild;
/**
 * 
 * Class to display the concept of function overloading.
 *
 */
public class Session4Assignment1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo d = new OverloadingDemo();
		System.out.println("calling sum(int,int)");
		d.sum(4, 3);
		d.displaySum();
		System.out.println("===============================");
		System.out.println("calling sum(int,int,int)");

		d.sum(5, 6, 7);
		d.displaySum();
	}

}
