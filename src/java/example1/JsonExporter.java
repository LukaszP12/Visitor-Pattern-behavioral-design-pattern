package example1;

class JsonExporter implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println("{ \"shape\": \"circle\", \"radius\": " + circle.radius + " }");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("{ \"shape\": \"rectangle\", \"width\": " + rectangle.width + ", \"height\": " + rectangle.height + " }");
    }
}
