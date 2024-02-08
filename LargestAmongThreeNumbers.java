import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1 = 0, number2 = 0, number3 = 0;

		System.out.println("Enter the number1 : ");

		number1 = scanner.nextInt();

		System.out.println("Enter the number2 : ");

		number2 = scanner.nextInt();

		System.out.println("Enter the number3 : ");

		number3 = scanner.nextInt();
		
		if(number1>=number2 && number1>=number3)
			System.out.println(number1 + " is a largest number");
		else if(number2>=number1 && number2>=number3)
			System.out.println(number2 + " is a largest number");
		else
			System.out.println(number3 + " is a largest number");

	}

}
