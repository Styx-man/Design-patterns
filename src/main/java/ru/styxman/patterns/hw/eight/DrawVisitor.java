package ru.styxman.patterns.hw.eight;

/**
 * DrawVisitor.
 */
public class DrawVisitor implements Visitor {

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Draw rectangle with length = " + rectangle.getLength()
                + " and width = " + rectangle.getWidth());

    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Draw triangle with base A = " + triangle.getA()
                + " and base B = " + triangle.getB()
                + " and base C = " + triangle.getC());
    }

    @Override
    public void visit(Parallelepiped parallelepiped) {
        System.out.println("Draw parallelepiped with length = " + parallelepiped.getLength()
                + " and width = " + parallelepiped.getWidth()
                + " and height = " + parallelepiped.getHeight());
    }
}
