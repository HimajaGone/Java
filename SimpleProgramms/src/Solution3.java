import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n to print all numbers divisible by 5");
		int n=sc.nextInt();
		for(int i=5;i<=n;i+=5) {
			int res=divisibleBy5(i);
			if(res>0)
				System.out.println(res);
		}
	}
	public static int divisibleBy5(int n) {
		if( n%5==0) 
			return n;
		return -1;
	}
}
