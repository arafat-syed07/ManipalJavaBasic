package Assingnment_Interface;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.142 * r * r;
    }
}
