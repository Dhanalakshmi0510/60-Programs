import java.util.Scanner;

public class AlphapetOrNot {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		
		Character charValue = scanner.next().charAt(0);
		
		int number = charValue;
		
		if((number>=65 && number<=90) || (number>=97 && number<=122))
			System.out.println(charValue + " is a Alphabet");
		else
			System.out.println(charValue + " is not a Alphabet");

	}

}
