import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char alpha = 0;

		int alphaNumber = 0;

		System.out.println("Enter the Number : ");

		alpha = scanner.next().toUpperCase().charAt(0);

		alphaNumber = alpha;

		int start = alphaNumber, startAscii = 65;

		start = start - startAscii;

		System.out.println("Alpha Pattern : ");

		for (int i = start; i >= 0; i--) {

			for (int j = i; j >= 0; j--) {

				System.out.print((char) (i + startAscii) + " ");

			}

			System.out.println();

		}

	}

}
