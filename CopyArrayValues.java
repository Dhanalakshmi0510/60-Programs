import java.util.Scanner;

public class CopyArrayValues {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter the array count : ");
		
		count = scanner.nextInt();
		
		int[] array = new int[count];
		
		System.out.println("Enter the array values : ");
		
		for(int i=0;i<count;i++) 
			array[i] = scanner.nextInt();
		
		System.out.println("Array Values are : ");

		for(int i=0;i<count;i++) 
			System.out.print(array[i] + " ");
		
		int[] copyArray = array;
		
		System.out.println("\nCopy Array Values are : ");
		for(int i=0;i<count;i++) 
			System.out.print(copyArray[i] + " ");
	}

}
