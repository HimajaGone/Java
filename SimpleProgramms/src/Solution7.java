import java.util.Scanner;

public class Solution7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n to print even divisible by 3");
		int n=sc.nextInt();
		for(int i=6;i<=n;i+=2) {
			int res=evenDivisibleBy3(i);
			if(res>0)
				System.out.println(res);
		}
	}
	public static int evenDivisibleBy3(int n) {
		if(n%3==0) 
			return n;
		return -1;
	}
}
