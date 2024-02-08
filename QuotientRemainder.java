import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1 = 0, remainder = 0, number2 = 0, quotient = 0;

		System.out.println("Enter the Dividend Number : ");

		number1 = scanner.nextInt();

		System.out.println("Enter the Divisor Number : ");

		number2 = scanner.nextInt();

		quotient = number1 / number2;

		remainder = number1 % number2;

		System.out.println("Quotient : " + quotient);
		
		System.out.println("Remainder : " + remainder);

	}

}
