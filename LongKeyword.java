
public class LongKeyword {

	public static void main(String[] args) {

		System.out.println("Declaring and initializing long variable : ");

		Long num = 15000000000L;

		System.out.println(num);

		System.out.println("-----------------------------------------------------");

		System.out.println("Performing Basic Opertions with Long : ");

		long n1 = 2500000000000l;
		long n2 = 3000000000000l;
		long sum = n1 + n2;
		System.out.println("Sum : " + sum);

		System.out.println("-----------------------------------------------------");

		System.out.println("Using Long with Arrays : ");

		long[] array = { 1000000000L, 30000000000l, 70000000000l };
		for (long value : array)
			System.out.println(value);

		System.out.println("-----------------------------------------------------");

		System.out.println("Using Long in methods : ");

		System.out.println("Cube Value : " + cube(222222l));

		System.out.println("-----------------------------------------------------");

		System.out.println("Working with long wrapper class : ");

		String str1 = "30000000000";

		Long longVal = Long.valueOf(str1);

		System.out.println("Change String to Long : " + longVal);

		String str2 = Long.toString(longVal);

		System.out.println("Change Long to String : " + str2);

		System.out.println("-----------------------------------------------------");

		long max = Long.MAX_VALUE;

		long min = Long.MIN_VALUE;

		System.out.println("Long Max Value : " + max);

		System.out.println("Long Min Value : " + min);

		System.out.println("-----------------------------------------------------");

	}

	public static long cube(long num) {

		return num * num * num;

	}

}
