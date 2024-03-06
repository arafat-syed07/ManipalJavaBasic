package firstClass;

public class OperatorEg {
	int a = 10;
	double b = 9.8;
	
	public void add() {
		double c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		OperatorEg eg = new OperatorEg();
		eg.add();
		
	}

}
