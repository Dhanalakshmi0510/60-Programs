import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the array count : ");

		int count = scanner.nextInt();

		int[] array = new int[count];

		System.out.println("Enter the array values : ");

		for (int i = 0; i < count; i++)
			array[i] = scanner.nextInt();

		System.out.println("Before Right Rotate");

		for (int i = 0; i < count; i++)
			System.out.print(array[i] + " ");

		int temp = 0;
		for (int i = 0; i < count; i++) {

			if (i == 0) {
				temp = array[i];
				array[i] = array[count - 1];
			} else {
				int currentValue = array[i];
				array[i] = temp;
				temp = currentValue;
			}

		}

		System.out.println("\nAfter Right Rotate");

		for (int i = 0; i < count; i++)
			System.out.print(array[i] + " ");

	}

}
