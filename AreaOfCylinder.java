import java.util.Scanner;

public class AreaOfCylinder {

	public static final double pi = 3.14;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double radius=0,height=0, area=0;
		
		System.out.println("Enter the Radius : ");
		
		radius = scanner.nextDouble();
		
		System.out.println("Enter the Height : ");
		
		height = scanner.nextDouble();

		area = (2 * pi * radius * height) + (2 * pi * radius * radius);
		
		System.out.println("Area of the Cylinder : " + area);
		
	}

}
