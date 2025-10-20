package example1;

class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
