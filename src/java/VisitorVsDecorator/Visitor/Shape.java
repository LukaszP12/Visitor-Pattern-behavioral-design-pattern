package VisitorVsDecorator.Visitor;

import example1.Visitor;

interface Shape {
    void accept(Visitor visitor);
}
