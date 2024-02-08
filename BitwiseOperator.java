import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1 = 0, number2 = 0;

		System.out.println("Enter the number 1 : ");

		number1 = scanner.nextInt();

		System.out.println("Enter the number2 : ");

		number2 = scanner.nextInt();

		System.out.println("Bitwise Operator");

		System.out.println("Bitwise OR (|)");

		System.out.println(number1 + " | " + number2 + " = " + (number1 | number2));

		System.out.println("Bitwise AND (&)");

		System.out.println(number1 + " & " + number2 + " = " + (number1 & number2));

		System.out.println("Bitwise XOR (^)");

		System.out.println(number1 + " ^ " + number2 + " = " + (number1 ^ number2));

		System.out.println("Bitwise Complement (~)");

		System.out.println(number1 + " ~ = " + (~number1));

	}

}
