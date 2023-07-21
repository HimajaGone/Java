package com.kodnest.practice;

public class Task {
	void DivisibleBy2(int n){
		System.out.println("divisible by 2 are");
		for(int i=2;i<=n;i+=2) {
			 {
				 System.out.println(i);
			 }
		}
	}
	void divisibleBy3(int n) {
		System.out.println("divisible by 3 are");
		for(int i=3;i<=n;i+=3) {
			System.out.println(i);
		}
	}
	void divisibleBy5(int n) {
		System.out.println("divisible by 5 are");
		for(int i=5;i<=n;i+=5) {
			System.out.println(i);
		}
	}
	void divisibleBy2And5(int n) {
		System.out.println("divisible by 2 and 5");
		for(int i=10;i<=n;i+=5) {
			if(i%2==0 && i%5==0)
			System.out.println(i);
		}
	}
	void divisibleBy3And5(int n) {
		System.out.println("divisible by 3 and 5");
		for(int i=15;i<=n;i+=3) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
	void allEvenDividibleBy3(int n) {
		System.out.println("all even divisible by 3");
		for(int i=6;i<=n;i+=2) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
	void allOddDividibleBy5(int n) {
		System.out.println("all odd divisible by 5");
		for(int i=5;i<=n;i+=2) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
	void primeNum(int n) {
		System.out.println("all Prime numbers");
		if(n<0) {
			System.out.println("n is not a prime");
		}
		boolean isPrime=true;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime==false) {
			System.out.println("n is not a prime");
		}
		else {
			System.out.println(n+" is a prime");
		}
	}
	
	
}
