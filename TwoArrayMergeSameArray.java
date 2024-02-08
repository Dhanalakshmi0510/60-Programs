import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoArrayMergeSameArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int array1Count = 0, array2Count = 0;

		System.out.println("Enter Array1 Count : ");

		array1Count = scanner.nextInt();

		System.out.println("Enter Array2 Count : ");

		array2Count = scanner.nextInt();

		int array1[] = new int[array1Count];

		int array2[] = new int[array2Count];

		Set<Integer> set = new HashSet<Integer>();

		System.out.println("Enter sorted array1 " + array1Count + " Values");

		for (int i = 0; i < array1Count; i++) {
			array1[i] = scanner.nextInt();
			set.add(array1[i]);
		}

		System.out.println("Enter sorted array2 " + array2Count + " Values");

		for (int i = 0; i < array2Count; i++) {
			array2[i] = scanner.nextInt();
			set.add(array2[i]);
		}

		System.out.println("Input :");

		System.out.println("Array 1 : ");
		for (int i = 0; i < array1Count; i++)
			System.out.print(array1[i] + " ");

		System.out.println("\nArray 2 : ");
		for (int i = 0; i < array2Count; i++)
			System.out.print(array2[i] + " ");

		System.out.println("\nOutput : \nMergedArray : ");

		for (Integer value : set)
			System.out.print(value + " ");

	}

}
