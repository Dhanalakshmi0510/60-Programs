import java.util.Scanner;

public class Pattern49 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int number = scanner.nextInt();

		int left = 0;

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= number; j++) {

				if (left >= j)
					System.out.print(" ");
				else
					System.out.print("* ");

			}
			
			left++;

			System.out.println();
			 
		}

	}

}
