package multipleInheritance;

public class MultipleChildInterfaceClass implements Inheritance1, Inheritance2 {

	public void writestatus() {
		System.out.println("Writing");

	}

	public void readstatus() {

		System.out.println("Reading");

	}

	public static void main(String[] args) {
		MultipleChildInterfaceClass obj = new MultipleChildInterfaceClass();
		obj.readstatus();
		obj.writestatus();

	}

}
