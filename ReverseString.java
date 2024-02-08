import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String : ");

		String words = scanner.nextLine();

		String[] array = words.split(" ");

		String[] output = new String[array.length];

		int position = 0;

		for (int i = array.length - 1; i >= 0; i--) {

			output[position] = array[i];

			position++;

		}

		System.out.println("Input : ");

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println("\noutput : ");

		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

	}

}
