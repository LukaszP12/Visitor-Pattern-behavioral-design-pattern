package VisitorVsInterpreter.Interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression expr = new Subtract(new Add(new Number(5), new Number(3)),
                new Number(2)
        );
        System.out.println("Result = " + expr.interpret());
    }
}
