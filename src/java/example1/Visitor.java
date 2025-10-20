package example1;

interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
//The Visitor pattern does violate OCP when it comes to adding new element types.
//        ✔️ But it's a trade-off by design — it intentionally makes adding new
//        behaviors easy at the cost of making new element types harder to add.