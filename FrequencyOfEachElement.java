import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachElement {

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

			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);

		}

		System.out.println("Output : ");

		System.out.println("--------------------------");

		System.out.println("Elements  |  Frequency");

		System.out.println("---------------------------");

		for (Map.Entry<Integer, Integer> value : map.entrySet())
			System.out.println("    " + value.getKey() + "     |    " + value.getValue() + "    ");

		System.out.println("---------------------------");
		
	}

}
