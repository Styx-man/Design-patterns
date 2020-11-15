package ru.styxman.patterns.hw.eight;

/**
 * AreaVisitor.
 */
public class AreaVisitor implements Visitor {

    @Override
    public void visit(Rectangle rectangle) {
        int area = rectangle.getLength() * rectangle.getWidth();
        System.out.println("Rectangle area = " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double p = (double) (triangle.getA() + triangle.getB() + triangle.getC()) / 2; // half-perimeter
        double h = 2 * Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC())) / triangle.getA(); // height
        double area = h * triangle.getA() / 2;
        System.out.println("Triangle area = " + area);
    }

    @Override
    public void visit(Parallelepiped parallelepiped) {
        int area = 2 * (parallelepiped.getLength() * parallelepiped.getWidth()
                + parallelepiped.getWidth() * parallelepiped.getHeight()
                + parallelepiped.getHeight() * parallelepiped.getLength()); // full area
        System.out.println("Parallelepiped area = " + area);
    }
}
