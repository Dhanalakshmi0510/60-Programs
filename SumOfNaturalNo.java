import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int count = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i <= count; i++)
			sum = sum + i;

		System.out.println("Sum of Natural Numbers : " + sum);

		String text = String.valueOf(sum);

		String maxValue = String.valueOf(text.charAt(0));

		for (int i = 1; i < text.length() - 1; i++) {

			String firstVal = String.valueOf(text.charAt(i)), secondVal = "";

			maxValue = greater(firstVal, maxValue);

		}

		System.out.println("Largest Digit of the sum : " + maxValue);

	}

	public static String greater(String str1, String str2) {

		int a = Integer.parseInt(str1);

		int b = Integer.parseInt(str2);

		if (a < b)
			return String.valueOf(b);

		return String.valueOf(a);

	}

}
