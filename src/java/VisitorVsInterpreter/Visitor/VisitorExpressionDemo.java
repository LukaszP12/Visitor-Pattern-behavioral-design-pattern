package VisitorVsInterpreter.Visitor;

public class VisitorExpressionDemo {
    public static void main(String[] args) {
        ExpressionNode expr = new SubNode(
                new AddNode(new NumberNode(5), new NumberNode(3)),
                new NumberNode(2)
        );

        EvalVisitor evaluator = new EvalVisitor();
        expr.accept(evaluator);
        System.out.println("Result = " + evaluator.result);
    }
}
