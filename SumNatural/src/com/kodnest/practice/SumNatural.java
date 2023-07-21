package com.kodnest.practice;

import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		natural(n);
	}
	static void natural(int num) {
		int sum=num*(num+1)/2;
		System.out.println("sum of n natual numbers "+sum);
	}

}
