package VisitorVsIterator.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ShapeCollection implements Iterable<Shape> {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public Iterator<Shape> iterator() {
        return shapes.iterator();
    }
}
