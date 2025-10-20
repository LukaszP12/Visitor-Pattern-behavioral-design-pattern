package VisitorVsDecorator.Decorator;

class RectangleShape implements ShapeComponent{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
