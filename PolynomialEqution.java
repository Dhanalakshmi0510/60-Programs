import java.util.Scanner;

public class PolynomialEqution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number1 : ");

		int number1 = scanner.nextInt();

		System.out.println("Enter the number2 : ");

		int number2 = scanner.nextInt();

		System.out.println("Enter the number3 : ");

		int number3 = scanner.nextInt();

		double x1 = 0, x2 = 0, n1;

		n1 = (number2 * number2) - (4 * number1 * number3);

		x1 = (-number2 + Math.sqrt(n1)) / (2 * number1);

		x2 = (-number2 - Math.sqrt(n1)) / (2 * number1);

		System.out.println("x1 = " + x1 + " , x2 = " + x2);

	}

}
