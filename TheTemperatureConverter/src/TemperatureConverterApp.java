import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp f");
		double fahrenheit = sc.nextDouble();
		TemperatureConverter tc = new TemperatureConverter();
		System.out.printf("%.2f",tc.convertFahrenheitToCelsius(fahrenheit));
	}

}
