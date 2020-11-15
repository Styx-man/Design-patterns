package ru.styxman.patterns.hw.eight;

/**
 * Visitor.
 */
public interface Visitor {

    void visit(Rectangle rectangle);

    void visit(Triangle triangle);

    void visit(Parallelepiped parallelepiped);
}
