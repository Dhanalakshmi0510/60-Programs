import java.util.Scanner;

public class Pattern50 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number : ");

		int number = scanner.nextInt();
		
		int left=0;
		
		for(int i=number;i>=1;i--) {
			
			for(int j=1;j<=number;j++) {
				
				if(j<=left)
					System.out.print(" ");
				else
					System.out.print(i + " ");
			}
			
			left++;
			System.out.println();
			
		}

	}

}
