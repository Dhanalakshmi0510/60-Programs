import java.util.Scanner;

public class EvenPositionArrayElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the array count : ");
		
		int count = scanner.nextInt();
		
		int[] array = new int[count];

		System.out.println("Enter the array values : ");
		
		for(int i=0;i<count;i++)
			array[i] = scanner.nextInt();
		
		System.out.println("Output : ");
		
		for(int i=0;i<count;i++) {
			if(i%2==0)
				System.out.print(array[i] + " ");
		}
			
	}

}
