package Home1;

public class Rectangle extends Form {
    protected double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        setArea(length * width);
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * (length + width));
    }
}