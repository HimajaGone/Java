import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n to print all numbers divisible by 2 and 5");
		int n=sc.nextInt();
		for(int i=2;i<=n;i+=2) {
			int res=divisibleBy2and5(i);
			if(res>0)
				System.out.println(res);
		}
	}
	public static int divisibleBy2and5(int n) {
		if(n%2==0 && n%5==0) 
			return n;
		return -1;
	}
}
