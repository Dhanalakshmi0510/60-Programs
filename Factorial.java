import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int number = scanner.nextInt();

		int output = 1, n = number;

		while (number != 0) {

			output = output * number;

			number--;

		}

		System.out.println(n + "! = " + output);

		String no = String.valueOf(output);

		int value = 0;

		for (int i = 0; i < no.length(); i++) {
			value = value + Integer.parseInt(String.valueOf(no.charAt(i)));
		}

		System.out.println("Sum of Fact Value is : " + value);

	}

}
