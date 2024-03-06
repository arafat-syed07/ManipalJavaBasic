package Assingment;

public class Main {
	public static void main(String[] args) {
		double r = 2.0;
		Circle circle = new Circle(r);
		double ts1 = 1.0, ts2 = 2.0, ts3 = 3.0;
		Triangle triangle = new Triangle(ts1, ts2, ts3);
		System.out.println("Radius of the Circle" + r);
		System.out.println("Area of the Circle: " + circle.calculateArea());
		System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
		System.out.println("\nSides of the Traiangel are: " + ts1 + ',' + ts2 + ',' + ts3);
		System.out.println("Area of the Triangle: " + triangle.calculateArea());
		System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
	}
}