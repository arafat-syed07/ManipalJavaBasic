package firstClass;

public class IfElseProg {
	
	public static void positive() {
		int x = 10;
		if(x>0) {
			System.out.println("X is Positive");
		}
		else if(x<0) {
			System.out.println("X is Negative");
		}
		else {
			System.out.println("X is Zero");
		}
		
		
	}
	
	public static void main(String[] args) {
		IfElseProg ifelse = new IfElseProg();
		ifelse.positive();
		
	}

}
