package firstClass;

public class basic {
	
	int a=20;
	int b=10;
	
	public void cal() {
		int c = a+b;
		System.out.println(c);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		
		basic eg = new basic();
		eg.cal();
		

	}

}
