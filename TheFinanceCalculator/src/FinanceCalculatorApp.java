import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter princple, rate and time");
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		
		System.out.printf("%.2f",calculator.calculateSimpleInterest(principle,rate,time));
	}

}
