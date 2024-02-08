import java.util.Scanner;

public class Ouestion53 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String : " );
		
		String text = scanner.next();

		System.out.println("Input : ");
		
		System.out.println(text);
		
		System.out.println("Output : ");
		
		for(int i=0;i<text.length();i++) {
		
			String newChar = String.valueOf(text.charAt(i));
			String numberString = String.valueOf(text.charAt(i+1));
			
			if(text.length()>(i+2)) {
				char nextValue = text.charAt(i+2);
				if(!((nextValue>=65 && nextValue<=90) || (nextValue>=97 && nextValue<=122))) {
					numberString = "" +  numberString + nextValue;
					i++;
				}
			}
			
			int number = Integer.parseInt(numberString);
			
			System.out.print(newChar.repeat(number));
			
			i++;
		
		}
		
		
		
		
		
	}

}
