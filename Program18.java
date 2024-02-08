import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number 1 : ");

		int number1 = scanner.nextInt();

		System.out.println("Enter the Number 1 : ");

		int number2 = scanner.nextInt();

		int x1 = 0, x2 = 0, x3 = 0,n1=0,n2=0;
		
		n1 = number1;
		n2 =number2;

		x1 = ++number1 - number2--;
		System.out.println("i) ++a-b-- = " + x1);

		number1 = n1;
		number2 = n2;
		
		x2 = number1 % number2++;
		System.out.println("ii) a%b = " + x2);

		number1 = n1;
		number2 = n2;
		
		number1 *= number2 + 5;
		System.out.println("iii) a*=b+5 = " + number1);

		number1 = n1;
		number2 = n2;
		
		x3 = 69 >>> 2;
		System.out.println("iv) 69>>>2 = " + x3);

	}

}
