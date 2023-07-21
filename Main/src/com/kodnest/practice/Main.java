package com.kodnest.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		Task t=new Task();
		t.DivisibleBy2(n);
		t.divisibleBy2And5(n);
		t.allEvenDividibleBy3(n);
		t.allOddDividibleBy5(n);
		t.divisibleBy3(n);
		t.divisibleBy5(n);
		t.divisibleBy3And5(n);
		t.primeNum(n);
	}

}
