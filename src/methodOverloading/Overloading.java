package methodOverloading;

public class Overloading {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

	public void add(int a, int b, int c, int d) {
		int e = a + b + c + d;
		System.out.println(e);
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.add(1, 2);
		ol.add(1, 2, 3);
		ol.add(1, 2, 3, 4);
	}

}
