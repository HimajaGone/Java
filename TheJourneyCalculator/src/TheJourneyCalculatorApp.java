import java.util.Scanner;

public class TheJourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed and time as realnumbers");
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double result = journeyCalculator.calculateDistance(60.0, 1.5);
		System.out.printf("%.2f",result);
	}

}
