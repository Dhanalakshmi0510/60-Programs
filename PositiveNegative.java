import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number=0;
		
		System.out.println("Enter the number : ");
		
		number = scanner.nextInt();
		
		if(number<0) 
			System.out.println(number + " is Negative");
		else
			System.out.println(number + " is Positive");
		

	}

}
