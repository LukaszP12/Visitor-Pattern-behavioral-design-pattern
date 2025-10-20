package VisitorVsIterator.Visitor;

class CircleV implements VisitableShape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
