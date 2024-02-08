import java.util.Scanner;

public class SortOddEven {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the array count : ");
		
		int count = scanner.nextInt();
		
		int[] array = new int[count];
		
		System.out.println("Enter array Values : ");
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter array " + (i+1) + " value : ");
			array[i] = scanner.nextInt();
		}	
		
		System.out.println("Input : ");
		
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		
		for(int i=0;i<count;i+=2) {
			if(array.length>(i+2) && array[i]<array[i+2]) {
				int temp= array[i+2];
				array[i+2] = array[i];
				array[i] = temp;
				i=-2;
			}
		}
		
		for(int i=1;i<count;i+=2) {
			if(array.length>(i+2) && array[i]>array[i+2]) {
				int temp= array[i+2];
				array[i+2] = array[i];
				array[i] = temp;
				i=-1;
			}
		}
		
		System.out.println("\noutput : ");
		
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		
		

	}

}
