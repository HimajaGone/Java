import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number n to print all numbers divisible by 3");
		int n=sc.nextInt();
		for(int i=3;i<=n;i+=3) {
			int res=divisibleBy3(i);
			if(res>0)
				System.out.println(res);
		}
	}
	public static int divisibleBy3(int n) {
		if( n%3==0) 
			return n;
		return -1;
	}
}
