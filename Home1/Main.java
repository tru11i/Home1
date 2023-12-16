package Home1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3, 7);
        Square square = new Square(3);

        // Вычисление площади и периметра
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        square.calculateArea();
        square.calculatePerimeter();
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
    }
}