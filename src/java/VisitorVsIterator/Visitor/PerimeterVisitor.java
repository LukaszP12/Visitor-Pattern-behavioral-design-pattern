package VisitorVsIterator.Visitor;

class PerimeterVisitor implements Visitor {

    @Override
    public void visit(CircleV circle) {
        System.out.println("Perimeter of Circle = 2 * π * r");
    }

    @Override
    public void visit(RectangleV rectangle) {
        System.out.println("Perimeter of Rectangle = 2 * (width + height)");
    }
}
