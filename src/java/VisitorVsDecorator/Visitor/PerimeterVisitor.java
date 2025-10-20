package VisitorVsDecorator.Visitor;

class PerimeterVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("Perimeter Circle = " + 2 * Math.PI * circle.radius);
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Perimeter Rectangle = " + 2 * (rectangle.w + rectangle.h));
    }
}
