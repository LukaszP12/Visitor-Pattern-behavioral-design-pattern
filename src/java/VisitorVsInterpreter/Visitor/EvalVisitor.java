package VisitorVsInterpreter.Visitor;

class EvalVisitor implements ExpressionVisitor {
    int result;

    @Override
    public void visit(NumberNode number) {
        result = number.value;
    }

    @Override
    public void visit(AddNode add) {
        add.left.accept(this);
        int left = result;
        add.right.accept(this);
        result = left + result;
    }

    @Override
    public void visit(SubNode sub) {
        sub.left.accept(this);
        int left = result;
        sub.right.accept(this);
        result = left - result;
    }
}
