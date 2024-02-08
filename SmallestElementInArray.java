import java.util.Scanner;

public class SmallestElementInArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter the array count : ");

		count = scanner.nextInt();

		int[] array = new int[count];

		System.out.println("Enter the array values : ");

		for (int i = 0; i < count; i++)
			array[i] = scanner.nextInt();

		for (int i = 0; i < count; i++) {

			if ((count != (i + 1)) && array[i] > array[i + 1]) {

				int temp = array[i];

				array[i] = array[i + 1];

				array[i + 1] = temp;

				i = -1;

			}

		}

		System.out.println("Smallest Element in array : " + array[0]);

	}

}
