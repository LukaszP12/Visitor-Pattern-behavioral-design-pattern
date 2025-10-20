package VisitorVsInterpreter.Visitor;

class NumberNode implements ExpressionNode {
    int value;

    public NumberNode(int value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
