package VisitorVsDecorator.Decorator;

class DecoratorDemo {
    public static void main(String[] args) {
        RectangleShape rectangleShape = new RectangleShape();
        ColorDecorator blueRectangle = new ColorDecorator(rectangleShape, "blue");
        blueRectangle.draw();

        CircleShape circleShape = new CircleShape();
        ColorDecorator redCircle = new ColorDecorator(circleShape, "red");

        BorderDecorator blackCircledShape = new BorderDecorator(redCircle, "black");
        blackCircledShape.draw();
    }
}
