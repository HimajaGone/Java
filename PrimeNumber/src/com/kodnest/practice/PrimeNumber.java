package com.kodnest.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				System.out.println(n+" is not a prime");
//				return;
//			}
//		}
//		System.out.println(n+" is a prime number");
		
		//Approach2
		if(n<2) {
			System.out.println(n+" is not a prime");
		}
		boolean isPrime=true;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime==true) {
			System.out.println("Entered number "+n+ " is prime");
		}
			
		else {
			System.out.println("Entered number "+n+ " is not prime");
		}
	}

}
