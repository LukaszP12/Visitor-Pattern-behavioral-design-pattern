package VisitorVsDecorator.Visitor;

class AreaVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("Area Circle = " + Math.PI * circle.radius * circle.radius);
    }
    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Area Rectangle = " + rectangle.w * rectangle.h);
    }
}
