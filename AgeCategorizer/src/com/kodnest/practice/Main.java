package com.kodnest.practice;

import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age)
	{
		if(age>=0 && age<=12) {
			System.out.println("child");
		}
		else if(age<=19) {
			System.out.println("Teen");
		}
		else if(age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		categorizeAge(age);
	}

}
