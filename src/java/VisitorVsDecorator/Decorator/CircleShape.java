package VisitorVsDecorator.Decorator;

class CircleShape implements ShapeComponent{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
