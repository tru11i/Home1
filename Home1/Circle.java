package Home1;

public class Circle extends Form {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }
}