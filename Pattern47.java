import java.util.Scanner;

public class Pattern47 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int number = scanner.nextInt();

		System.out.println("Output : ");

		int left = number, right = number, leftValue=number,rightValue=number;

		for (int i = 1; i <= number; i++) {
			
			leftValue=1;
			rightValue=i-1;

			for (int j = 1; j <= (number * 2) - 1; j++) {

				if (j == number)
					System.out.print(i + " ");
				else if (j >= left && j <= right) {
					if(j<number) {
						System.out.print(leftValue + " ");
						leftValue++;
					}else {
						System.out.print(rightValue + " ");
						rightValue--;
					}
				}else
					System.out.print("  ");

			}

			left--;
			right++;

			System.out.println();

		}

	}

}
