package Home1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void calculateArea() {
        setArea(Math.pow(super.length, 2));
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(4 * super.length);
    }
}
