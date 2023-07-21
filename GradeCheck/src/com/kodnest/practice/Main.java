package com.kodnest.practice;
import java.util.Scanner;
public class Main
{
	public static void checkGrade(int grade)
	{ 
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade");
		int grade=sc.nextInt();
		checkGrade(grade);
	}
}
