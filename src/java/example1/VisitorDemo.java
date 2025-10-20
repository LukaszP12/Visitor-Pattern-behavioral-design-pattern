package example1;

public class VisitorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        Visitor areaVisitor = new AreaCalculator();

        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);
    }
}
