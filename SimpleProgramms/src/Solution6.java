import java.util.Scanner;

public class Solution6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n to print odd numbers divisible by 5");
		int n=sc.nextInt();
		for(int i=5;i<=n;i+=5) {
			int res=oddDivisibleBy5(i);
			if(res>0)
				System.out.println(res);
		}
	}
	public static int oddDivisibleBy5(int n) {
		if(n%2!=0 && n%5==0) 
			return n;
		return -1;
	}
}
