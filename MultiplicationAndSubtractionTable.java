import java.util.Scanner;

public class MultiplicationAndSubtractionTable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = 0, value = 0, count = 0;

		System.out.println("Enter the Table Number : ");

		number = scanner.nextInt();

		System.out.println("Enter the Total Line Count : ");

		count = scanner.nextInt();

		System.out.println("*************************");

		System.out.println("Multiplication Table : ");

		System.out.println("*************************");

		for (int i = 1; i <= count; i++) {

			System.out.println(i + " * " + number + " = " + (i * number));

		}

		System.out.println("*************************");

		System.out.println("Subtraction Table : ");

		System.out.println("*************************");

		for (int i = 1; i <= count; i++) {

			System.out.println(i + " "
					+ "- " + number + " = " + (i - number));

		}

		System.out.println("*************************");

	}

}
