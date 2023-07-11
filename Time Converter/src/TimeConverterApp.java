import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minutes");
		int minutes = sc.nextInt();
		System.out.println(convertToHours(minutes));
	}
	public static double convertToHours(int minutes) {
		return (double)minutes/60;
	}

}
