import java.util.Scanner;

public class Program60 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Count : ");

		int count = scanner.nextInt();

		int sum = 0, number = 1;

		String sumTerms = "";

		for (int i = 1; i <= count; i++) {

			String duplicate = String.valueOf(number).repeat(i);

			if (i == count) {
				sumTerms = sumTerms + duplicate;
			} else {
				sumTerms = sumTerms + duplicate + " + ";
			}

			sum = sum + Integer.parseInt(duplicate);

		}

		System.out.println("Input the number of terms : " + count);

		System.out.println("Output : ");

		System.out.println(sumTerms);

		System.out.println("The Sum is : " + sum);

	}

}
