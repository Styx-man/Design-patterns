package ru.styxman.patterns.hw.eight;

/**
 * Rectangle.
 */
public class Rectangle implements Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Before apply Visitor pattern
/*    @Override
    public void draw() {
        System.out.println("Draw rectangle with length = " + length + " and width = " + width);
    }

    @Override
    public void getArea() {
        int area = length * width;
        System.out.println("Rectangle area = " + area);
    }

    @Override
    public void getPerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Rectangle perimeter = " + perimeter);
    }

    @Override
    public void getVolume() {
        System.out.println("Rectangle has no volume");
    }
    */

    // After apply Visitor pattern
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
