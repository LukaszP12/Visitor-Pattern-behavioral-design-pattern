package VisitorVsInterpreter.Visitor;

interface ExpressionVisitor {
    void visit(NumberNode number);
    void visit(AddNode add);
    void visit(SubNode sub);
}
