package polymorphism;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return 3.142 * radius * radius;
	}
}
