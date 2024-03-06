package firstClass;

public class NonStaticFunction {
	
	String s1 = "Hello World";
	
	static int sf = 123456;

	public static void main(String[] args) {
		
		NonStaticFunction nsf = new NonStaticFunction();
		System.out.println(nsf.s1);
		System.out.println(sf);
	}

}
