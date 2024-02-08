import java.util.Scanner;

public class PrintNumberOfElments {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter the array count : ");
		
		count = scanner.nextInt();
		
		int[] array = new int[count];
		
		System.out.println("Enter the array values : ");
		
		for(int i=0;i<count;i++) 
			array[i] = scanner.nextInt();
		
		System.out.println("Number of Elements : " + count);
		
		System.out.print("Elements are : ");
		
		for(int i=0;i<count;i++) 
			System.out.print(array[i] + " ");

	}

}
