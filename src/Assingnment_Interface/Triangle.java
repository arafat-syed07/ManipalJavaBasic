package Assingnment_Interface;

public class Triangle implements Shape {
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        return 0.5 * b * h;
    }
}
