import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int temp = 0, number1 = 0, number2 = 0;

		System.out.println("Enter the number 1 : ");

		number1 = scanner.nextInt();

		System.out.println("Enter the number 2 : ");

		number2 = scanner.nextInt();

		System.out.println("Before Swapping : ");

		System.out.println("Number1 : " + number1);

		System.out.println("Number2 : " + number2);

		temp = number1;

		number1 = number2;

		number2 = temp;

		System.out.println("After Swapping : ");

		System.out.println("Number1 : " + number1);

		System.out.println("Number2 : " + number2);

	}

}
