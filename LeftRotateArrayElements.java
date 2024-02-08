import java.util.Scanner;

public class LeftRotateArrayElements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter the array count : ");

		count = scanner.nextInt();

		int[] array = new int[count];

		System.out.println("Enter the array values : ");

		for (int i = 0; i < count; i++)
			array[i] = scanner.nextInt();

		System.out.println("Before Left Rotate Array Elements :");

		for (int i = 0; i < count; i++)
			System.out.print(array[i] + " ");

		int firstDigit = 0;

		if (count != 0)
			firstDigit = array[0];

		for (int i = 0; i < count; i++) {

			if (count == (i + 1))

				array[i] = firstDigit;

			else {

				int temp = array[i];

				array[i] = array[i + 1];

				array[i + 1] = temp;

			}
		}

		System.out.println("\nAfter Left Rotate Array Elements ");

		for (int i = 0; i < count; i++)
			System.out.print(array[i] + " ");
	}

}
