package Home1;

public class Form {
    private double area;
    private double perimeter;

    protected void setArea(double area) {
        this.area = area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void calculateArea();
    public void calculatePerimeter();
}




