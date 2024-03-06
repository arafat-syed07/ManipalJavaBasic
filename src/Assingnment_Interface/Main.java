package Assingnment_Interface;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        
        Circle circle = new Circle(2);
        
        Triangle triangle = new Triangle(2, 4);

        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        
        System.out.println("Area of the Circle: " + circle.getArea());
        
        System.out.println("Area of the Triangle: " + triangle.getArea());
    }
}
