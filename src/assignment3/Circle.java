package assignment3;

public class Circle {

    final private double PI = Math.PI;
    final private double radius ;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {

        return PI*radius*radius;
    }
}
