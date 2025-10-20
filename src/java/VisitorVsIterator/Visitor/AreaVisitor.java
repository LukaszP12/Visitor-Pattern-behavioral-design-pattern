package VisitorVsIterator.Visitor;


class AreaVisitor implements Visitor{
    @Override
    public void visit(CircleV circle) {
        System.out.println("Calculating area of Circle");
    }

    @Override
    public void visit(RectangleV rectangle) {
        System.out.println("Calculating area of Rectangle");
    }
}
