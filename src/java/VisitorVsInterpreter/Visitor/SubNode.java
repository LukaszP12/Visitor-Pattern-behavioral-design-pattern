package VisitorVsInterpreter.Visitor;

class SubNode implements ExpressionNode {
    ExpressionNode left, right;

    public SubNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
