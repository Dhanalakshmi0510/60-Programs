import java.util.Scanner;

public class AsciiValueOfACharacter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		char chaVal = 0;
		
		String charString = "";
		
		System.out.println("Enter the Character : ");
		
		chaVal = scanner.next().charAt(0);
		
		int asciiValue = (int) chaVal;
		
		System.out.println("Ascii Value of " + chaVal + " is : " + asciiValue);
		

	}

}
