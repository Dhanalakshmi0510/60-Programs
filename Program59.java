import java.util.Scanner;

public class Program59 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String string1 = "", string2 = "";

		System.out.println("Enter the String 1 : ");

		string1 = scanner.next();

		System.out.println("Enter the String 2 : ");

		string2 = scanner.next();
		
		int index = string1.indexOf(string2);
		
		System.out.println("Output : " + index);

	}

}
