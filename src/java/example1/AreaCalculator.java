package example1;

class AreaCalculator implements Visitor{
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.radius * circle.radius;
        System.out.println("Circle area = " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.width * rectangle.height;
        System.out.println("Rectangle area = " + area);
    }
}
