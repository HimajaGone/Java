package com.kodnest.practice;

import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
		switch(productCode) {
		case "p01": System.out.println("COCA COLA");
			break; 
		case "p02": System.out.println("SPRITE");
			break; 
		case "p03": System.out.println("MAAZA"); 
			break; 
		case "p04": System.out.println("THUMPS UP"); 
			break; 
		case "p05":System.out.println("MOUNT DUE");
			break;
		default: System.out.println("OUT OF STOCK");
			break; 
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter productCode value");
		String productCode=sc.next();
		getProduct(productCode);

	}

}
