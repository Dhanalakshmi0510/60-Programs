import java.util.Scanner;

public class AlphabetCPrint {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the count : ");

		int count = scanner.nextInt();

		System.out.println("Input : " + count);

		System.out.println("Output : ");

		for (int i = 1; i <= count; i++) {

			for (int j = 1; j <= count; j++) {

				if ((j == 1 && i <= count) || (i == 1 && j <= count) || (i == count && j <= count))
					System.out.print("*" + " ");

			}

			System.out.println();

		}

	}

}
