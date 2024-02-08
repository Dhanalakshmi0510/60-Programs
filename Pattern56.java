import java.util.Scanner;

public class Pattern56 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int count = scanner.nextInt();

		System.out.println("Input : ");

		System.out.println(count);

		System.out.println("Output : ");

		int start=1,sum=0;
		while(sum==count || sum<=count) {
			sum = sum + start;
			if(sum==count || count<sum) {
				break;
			}
			start++;
		}
		
		int left = start,number = 1;

		for(int i=1;i<=start;i++) {
			for(int j=1;j<=start;j++) {
				if(left>j)
					System.out.print(" ");
				else 
					System.out.print(number++ + " ");
			}
			left--;
			System.out.println();
		}
		
//		int print = 1, lineCount = count / 2;
//		for (int i = 1; i <= lineCount && print <= count; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(print + " ");
//				print++;
//			}
//			System.out.println();
//		}

	}

}
