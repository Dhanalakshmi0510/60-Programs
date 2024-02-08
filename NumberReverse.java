import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int number = scanner.nextInt();

		int remainder = 0, reverseNumber = 0, copyNumber = number;

		while (number != 0) {

			remainder = number % 10;

			number = number / 10;

			reverseNumber = (reverseNumber * 10) + remainder;

		}

		System.out.println("Reverse Number : " + reverseNumber);

	}

}
