package VisitorVsIterator.Visitor;

class RectangleV implements VisitableShape{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
