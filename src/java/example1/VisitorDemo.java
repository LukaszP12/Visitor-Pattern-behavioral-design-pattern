package example1;

public class VisitorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("=== Calculating Area ===");
        Visitor areaCalc = new AreaCalculator();
        circle.accept(areaCalc);
        rectangle.accept(areaCalc);

        System.out.println("\n=== Exporting to JSON ===");
        Visitor jsonExport = new JsonExporter();
        circle.accept(jsonExport);
        rectangle.accept(jsonExport);
    }
}
