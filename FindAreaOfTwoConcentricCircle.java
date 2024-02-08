import java.util.Scanner;

public class FindAreaOfTwoConcentricCircle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius 1 : ");

		int r1 = scanner.nextInt();

		System.out.println("Enter the radius 2 : ");

		int r2 = scanner.nextInt();
		
		System.out.println("Input : \nRadius 1 : " + r1 + "\nRadius 2 : " + r2 + "\n");

		final double pi = 3.14;

		double ans = (pi * r1 * r1) - ( pi * r2 * r2);

		System.out.println("Output : \n" + ans);
		
	}

}
