package homeWork_27;
//Task 0
//        Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
//        Реализуйте классы-наследники Circle, Rectangle, и Triangle.
//        Убедитесь, что все классы правильно вычисляют площадь и периметр.
//        Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(12.0);
        shapes[1] = new Rectangle(23.0, 34.0);
        shapes[2] = new Triangle(23.0, 12.0, 14.0);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.Area();
            totalPerimeter += shape.Perimeter();
        }

        System.out.printf("Общая площадь фигур: %.2f", totalArea);
        System.out.println(" единиц^2");
        System.out.println("=====================================");
        System.out.printf("Общий периметр фигур: %.2f", totalPerimeter);
        System.out.println(" единиц^2");

    }
}
