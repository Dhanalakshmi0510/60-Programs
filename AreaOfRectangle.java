import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int length = 0, width =0;
		
		System.out.println("Enter the length : ");

		length = scanner.nextInt();
		
		System.out.println("Enter the Width : ");
		
		width = scanner.nextInt();
		
		System.out.println("Area of Rectangle is : " + (length * width));
		
	}

}
