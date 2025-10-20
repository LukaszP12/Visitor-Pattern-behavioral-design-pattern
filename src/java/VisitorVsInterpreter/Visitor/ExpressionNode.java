package VisitorVsInterpreter.Visitor;

interface ExpressionNode {
    void accept(ExpressionVisitor visitor);
}
