import java.util.Scanner;

public class Expression20 {

	public static void main(String[] args) {
		
		int x=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		x = scanner.nextInt();
		
		x = x++ * 2 + 3 * --x;
		
		System.out.println("Output (x++ * 2 + 3 * --x) : " + x);

	}

}
