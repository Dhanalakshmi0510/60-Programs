import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0, c = 0;

		double x1 = 0, x2 = 0, number1 = 0;

		System.out.println("Enter a Value : ");

		a = scanner.nextInt();

		System.out.println("Enter b Value : ");

		b = scanner.nextInt();

		System.out.println("Enter c Value : ");

		c = scanner.nextInt();

		number1 = (b * b) - (4 * a * c);

		number1 = Math.sqrt(number1);

		x1 = (-b + number1) / (2 * a);

		x2 = (-b - number1) / (2 * a);

		System.out.println("Output is " + x1 + " , " + x2);

	}

}
