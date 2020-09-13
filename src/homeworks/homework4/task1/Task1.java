package homeworks.homework4.task1;

public class Task1 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.6),
                new Triangle(1.1, 2),
                new Rectangle(4, 5.7)
        };
        for (Shape shape : shapes) {
            System.out.println("Площадь фигуры: " + shape.square());
        }
    }
}
