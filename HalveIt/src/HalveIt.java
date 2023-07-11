import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount");
	double num=sc.nextDouble();
	System.out.printf("%.2f",halveTheNumber(num));
	}
	public static double halveTheNumber(double num) {
		return num/2;
	}
}
