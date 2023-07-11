import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		double result = explorer.calculateSurfaceArea(radius);
		System.out.printf("%.2f",result);
	}

}
