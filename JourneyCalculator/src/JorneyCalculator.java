import java.util.Scanner;

public class JorneyCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		journeyCalculator journeyCalculator = new journeyCalculator();
		double distance =journeyCalculator.calculateDistance(speed, time); 
		System.out.printf("%.2f",distance);
	}

}
