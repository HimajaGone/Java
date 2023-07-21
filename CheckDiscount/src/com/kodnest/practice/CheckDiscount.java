package com.kodnest.practice;

import java.util.Scanner;

public class CheckDiscount {
	public static void checkDiscount(double purchaseAmount)
	{ 
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double amount=sc.nextDouble();
		checkDiscount(amount);
	}

}
