import java.util.Scanner;

public class solution8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for checkPrime");
		int  n = sc.nextInt();
		int count=0;
		for(int i=3;i<=n;i++) {
			int res= checkPrime(i);
			if(res!=0) {
				System.out.println(res);
				count++;
			}	
		}
		System.out.println("count of prime numbers "+count);
	}
	public static int checkPrime(int n) {
		int count=0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
	}
}
