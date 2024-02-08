import java.util.Scanner;

public class SumOfAllElementArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the array count : ");

		int count = scanner.nextInt();

		int[] array = new int[count];

		System.out.println("Enter the array values : ");

		int sum = 0;

		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
			sum = sum + array[i];
		}

		System.out.println("Sum of All Elements : " + sum);

	}

}
