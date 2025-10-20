package VisitorVsDecorator.Decorator;

abstract class ShapeDecorator implements ShapeComponent{
    protected ShapeComponent shape;

    public ShapeDecorator(ShapeComponent shape) {
        this.shape = shape;
    }
}
