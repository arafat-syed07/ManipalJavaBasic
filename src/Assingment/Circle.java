package Assingment;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double calculateArea() {
		return 3.142 * radius * radius;
	}

	double calculatePerimeter() {
		return 2 * 3.142 * radius;
	}
}
