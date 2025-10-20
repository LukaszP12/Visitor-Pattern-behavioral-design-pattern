package VisitorVsIterator.Iterator;

class IteratorDemo {
    public static void main(String[] args) {
        ShapeCollection shapes = new ShapeCollection();
        shapes.addShape(new Circle());
        shapes.addShape(new Rectangle());

        // Iterator = traversal only
        for (Shape shape : shapes) {
            shape.draw(); // Must decide operation here manually
        }
    }
}
