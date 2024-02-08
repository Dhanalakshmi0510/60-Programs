import java.util.Scanner;

public class GivenNoReverseNoDiff {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int number =0,reverse = 0 , remainder=0,copyNo=0;
		
		System.out.println("Enter the number : ");
		
		number = scanner.nextInt();
		
		copyNo = number;

		while(number!=0) {
			
			remainder = number % 10;
			number = number/10;
			
			reverse = remainder + ( reverse * 10);
			
		}
		
		System.out.println("Input : " + copyNo);
		System.out.println("Output : " + copyNo + " - " + reverse + " = " + (copyNo-reverse));

	}

}
