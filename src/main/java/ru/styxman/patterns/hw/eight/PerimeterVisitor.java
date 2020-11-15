package ru.styxman.patterns.hw.eight;

/**
 * PerimeterVisitor.
 */
public class PerimeterVisitor implements Visitor {

    @Override
    public void visit(Rectangle rectangle) {
        int perimeter = 2 * (rectangle.getLength() + rectangle.getWidth());
        System.out.println("Rectangle perimeter = " + perimeter);
    }

    @Override
    public void visit(Triangle triangle) {
        int perimeter = triangle.getA() + triangle.getB() + triangle.getC();
        System.out.println("Triangle perimeter = " + perimeter);
    }

    @Override
    public void visit(Parallelepiped parallelepiped) {
        int perimeter = 4 * (parallelepiped.getLength() + parallelepiped.getWidth() + parallelepiped.getHeight());
        System.out.println("Parallelepiped perimeter = " + perimeter);
    }
}
