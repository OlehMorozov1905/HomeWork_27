package homeWork_27;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double Area() {
        return width * height;
    }

    @Override
    public double Perimeter() {
        return 2 * (width + height);
    }
}
