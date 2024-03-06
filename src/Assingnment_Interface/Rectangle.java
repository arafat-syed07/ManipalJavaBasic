package Assingnment_Interface;

public class Rectangle implements Shape {
    private double l1;
    private double w1;

    public Rectangle(double l1, double w1) {
        this.l1 = l1;
        this.w1 = w1;
    }

    public double getArea() {
        return l1 * w1;
    }
}