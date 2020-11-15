package ru.styxman.patterns.hw.eight;

/**
 * Parallelepiped.
 */
public class Parallelepiped implements Shape {

    private int length;
    private int width;
    private int height;

    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Before apply Visitor pattern
/*    @Override
    public void draw() {
        System.out.println("Draw parallelepiped with length = " + length + " and width = " + width + " and height = " + height);
    }

    @Override
    public void getArea() {
        int area = 2 * (length * width + width * height + height * length); // full area
        System.out.println("Parallelepiped area = " + area);
    }

    @Override
    public void getPerimeter() {
        int perimeter = 4 * (length + width + height);
        System.out.println("Parallelepiped perimeter = " + perimeter);

    }

    @Override
    public void getVolume() {
        int volume = length * width * height;
        System.out.println("Parallelepiped volume = " + volume);
    }
    */

    // After apply Visitor pattern
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
