import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter the array count : ");

		count = scanner.nextInt();

		int[] array = new int[count];

		System.out.println("Enter the array values : ");

		for (int i = 0; i < count; i++)
			array[i] = scanner.nextInt();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < count; i++) {
			
			int key = array[i];
			
			if(map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
			
		}
		
		System.out.println("Duplicate Elements are : ");
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()!=1)
				System.out.println(entry.getKey() + " ");
		
		}
			

	}

}
