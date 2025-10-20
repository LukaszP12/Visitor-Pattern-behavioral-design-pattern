package VisitorVsDecorator.Decorator;

public class BorderDecorator extends ShapeDecorator {
    private String borderColor;

    public BorderDecorator(ShapeComponent shape, String borderColor) {
        super(shape);
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("→ with border color: " + borderColor);
    }
}
