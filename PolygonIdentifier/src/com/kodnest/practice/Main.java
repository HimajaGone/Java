package com.kodnest.practice;

import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides) 
	{
		if(sides>=0) {
		switch(sides) {
		case 3: System.out.println("Triangle");
			break; 
		case 4: System.out.println("Quadrilateral");
			break; 
		case 5: System.out.println("Pentagon"); 
			break; 
		case 6: System.out.println("Hexagon"); 
			break; 
		case 7: System.out.println("Heptagon"); 
			break; 
		case 8:System.out.println("Octogon");
			break;
		default: System.out.println("Polygon");
			break; 
			
		}
		}
		else {
			System.out.println("Either your math skill not good or your eyes are not good");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		identifyPolygon(n);
	}

}
