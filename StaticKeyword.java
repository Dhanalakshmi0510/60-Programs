
public class StaticKeyword {
	
	static String variable = "Static variable print without object creation";
	
	String variable2 = "Noraml Variable print with object creation";
	
	static {
		System.out.println("Static Block Call execute first");
	}

	public static void main(String[] args) {
		
		System.out.println("1.Static Block");
		
		System.out.println();

		System.out.println("2.Static Method");

		addStatic(2, 2);

		StaticKeyword keyword = new StaticKeyword();
		keyword.addNormal();
		
		System.out.println();
		
		System.out.println("3.Static Variable");
		
		System.out.println(variable);
		
		System.out.println(keyword.variable2);
		
		System.out.println();
		
		System.out.println("4.Static Nested Class");
		
		innerClass.print();
		
		StaticKeyword.innerClass2 class2 = new StaticKeyword.innerClass2();
		class2.print2();
		
	}

	public static void addStatic(int a, int b) {
		System.out.println("Static Method Call without object creation");
	}

	public void addNormal() {
		System.out.println("Normal Method call with object creation");
	}
	
	static class innerClass{
		
		static void print() {
			System.out.println("Static Inner Class Method Call without object creation");
		}
		
	}
	
	static class innerClass2{
		
		void print2() {
			System.out.println("Non Static Inner class method call with object creation");
		}
		
	}

}
