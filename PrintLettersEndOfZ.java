import java.util.Scanner;

public class PrintLettersEndOfZ {

	public static void main(String[] args) {
		
		int startValue=0, endValue = 90;
		
		Scanner scanner = new Scanner(System.in);
	
		Character newChar = null;
		
		System.out.println("Enter the Character : ");
		
		newChar = scanner.next().toUpperCase().charAt(0);
		
		startValue = newChar;
		
		System.out.println("Input : " + newChar);
		
		System.out.print("Output : ");
		
		for(int i=startValue;i<=endValue;i++) {
			
			System.out.print((char)i);
			
		}

		
	}

}
