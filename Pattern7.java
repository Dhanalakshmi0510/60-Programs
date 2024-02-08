import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = 0, startPosition = 0, endPosition = 0, midPosition = 0;

		String numString = "";

		System.out.println("Enter the odd number : ");

		number = scanner.nextInt();

		numString = String.valueOf(number);

		startPosition = Integer.parseInt(String.valueOf(numString.charAt(0)));

		endPosition = Integer.parseInt(String.valueOf(numString.charAt(numString.length() - 1)));

		System.out.println("Input : " + number);

		System.out.println("output : ");

		int increment = startPosition, decrement = endPosition;
		
		for (int i = startPosition; i <= endPosition; i++) {

			for (int j = startPosition; j <= endPosition; j++) {

				if(i==j || (increment==i && decrement==j)) 
					System.out.print(i);
				else
					System.out.print(" ");
			}
			
			increment++;
			decrement--;

			System.out.println();

		}

	}

}
