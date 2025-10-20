package VisitorVsDecorator.Decorator;

class ColorDecorator extends ShapeDecorator{
    private String color;

    public ColorDecorator(ShapeComponent shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("→ with color: " + color);
    }
}
