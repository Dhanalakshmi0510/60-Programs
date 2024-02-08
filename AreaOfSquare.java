import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int area = 0;

		System.out.println("Enter the area : ");

		area = scanner.nextInt();

		System.out.println("Area of the Square is : " + (area * area));

	}

}
