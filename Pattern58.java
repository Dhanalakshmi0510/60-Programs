import java.util.Scanner;

public class Pattern58 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int count = scanner.nextInt();

		System.out.println("Input : " + count + "\nOutput : ");

		int left = count / 2, right = left + 1;

		for (int i = 1; i <= count - 1; i++) {

			for (int j = 1; j <= count; j++) {

				if (i == 1 || i == (count - 1))
					System.out.print("*");
				else if (j <= count / 2 && j >= left)
					System.out.print("_");
				else if (j > count / 2 && j <= right)
					System.out.print("_");
				else
					System.out.print("*");
			}

			System.out.println();
			if (i != 1) {
				if (i < (count / 2)) {
					left--;
					right++;
				} else {
					right--;
					left++;
				}
			}

		}

	}

}
