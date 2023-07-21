import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n to print numbers divisible by 3 and comes in 5");
		int n=sc.nextInt();
		for(int i=3;i<=n;i+=3) {
			int res=divisibleBy3and5(i);
			if(res>0)
				System.out.println(res);
		}
	}
	public static int divisibleBy3and5(int n) {
		if(n%3==0 && n%5==0) 
			return n;
		return -1;
	}
}
