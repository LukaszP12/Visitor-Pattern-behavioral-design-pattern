package VisitorVsInterpreter.Visitor;

class AddNode implements ExpressionNode{
    ExpressionNode left,right;

    public AddNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
