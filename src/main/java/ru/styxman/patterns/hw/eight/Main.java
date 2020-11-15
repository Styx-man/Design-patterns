package ru.styxman.patterns.hw.eight;

/**
 * Main.
 *
 * @author Denis_Lukashov
 */
public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(12, 10),
                new Triangle(10, 24, 26),
                new Parallelepiped(12, 10, 6)
        };

        for (Shape shape : shapes) {
            System.out.println("*****");
            shape.accept(new DrawVisitor());
            shape.accept(new AreaVisitor());
            shape.accept(new PerimeterVisitor());
            shape.accept(new VolumeVisitor());
        }
    }
}
