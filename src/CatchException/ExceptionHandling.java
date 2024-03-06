package CatchException;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int data = 100 / 0;

		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block is executed always");
		}
	}

}
