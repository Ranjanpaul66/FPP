package assignment3;

final public class Triangle {

    final private double width;
    final private double height;


    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }

    public double computeArea() {

        return (width*height)/2;
    }

}
