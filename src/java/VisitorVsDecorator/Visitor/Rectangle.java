package VisitorVsDecorator.Visitor;

class Rectangle implements Shape{
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    public void accept(Visitor visitor) { visitor.visit(this); }
}
