import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Character charVal;

		System.out.println("Enter the character : ");

		charVal = scanner.next().charAt(0);

		if (charVal == 'a' || charVal == 'A' || charVal == 'e' || charVal == 'E' || charVal == 'i' || charVal == 'I'
				|| charVal == 'o' || charVal == 'O' || charVal == 'u' || charVal == 'U') 
			System.out.println(charVal + " is a vowel");
		else
			System.out.println(charVal + " is a consonant");

	}

}
