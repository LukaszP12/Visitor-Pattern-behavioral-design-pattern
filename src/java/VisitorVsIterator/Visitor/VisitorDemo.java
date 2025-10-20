package VisitorVsIterator.Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        VisitableShape[] shapes = {new CircleV(), new RectangleV()};

        Visitor areaCalc = new AreaVisitor();
        for (VisitableShape shape : shapes) {
            shape.accept(areaCalc);
        }
    }
}
