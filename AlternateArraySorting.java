import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlternateArraySorting {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int arrayCount = 0, midPosition = 0, increment=0,decrement=0;
		
		System.out.println("Enter Array Count Values : ");
		
		arrayCount = scanner.nextInt();
		
		int[] array = new int[arrayCount];
		
		System.out.println("Enter array values : ");
		
		for(int i=0; i<arrayCount;i++)
			array[i] = scanner.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> outList = new ArrayList<Integer>();
		
		System.out.println("Input : ");
		for(int i=0;i<arrayCount;i++) { 
			list.add(array[i]);
			System.out.print(array[i] + " ");
		}
		
		Collections.sort(list);
		
		System.out.println("Sorted Array : ");
		System.out.println(list);
		
		System.out.println("\nOutput : ");
		
		midPosition = arrayCount/2;
		
		decrement = arrayCount-1;
		
		for(int i=0;i<midPosition;i++) {
			
			outList.add(list.get(decrement));
			outList.add(list.get(increment));
			
			increment++;
			decrement--;
			
		}
		
		if(midPosition%2!=0)
			outList.add(list.get(decrement));
		
		for(Integer value : outList){
			System.out.print(value + " ");
		}
		
		
	}

}
