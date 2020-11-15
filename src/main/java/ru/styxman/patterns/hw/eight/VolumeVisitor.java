package ru.styxman.patterns.hw.eight;

/**
 * VolumeVisitor.
 */
public class VolumeVisitor implements Visitor {

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rectangle has no volume");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Triangle has no volume");
    }

    @Override
    public void visit(Parallelepiped parallelepiped) {
        int volume = parallelepiped.getLength() * parallelepiped.getWidth() * parallelepiped.getHeight();
        System.out.println("Parallelepiped volume = " + volume);
    }
}
