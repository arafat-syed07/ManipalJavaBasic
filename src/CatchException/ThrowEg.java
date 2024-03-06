package CatchException;

public class ThrowEg {

	public static void main(String[] args) {
		int age = 9;
		if(age < 18) {
			throw new ArithmeticException("Person is eligible for voting");
		}
	}

}
