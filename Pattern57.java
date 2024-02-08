import java.util.Scanner;

public class Pattern57 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Count : ");

		int number = scanner.nextInt();

		int left = 1, right = number;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (i == j)
					System.out.print(i + " ");
				else if (left == i && right == j)
					System.out.print(right + " ");
				else
					System.out.print("  ");
			}
			right--;
			left++;
			System.out.println();
		}

	}

}
