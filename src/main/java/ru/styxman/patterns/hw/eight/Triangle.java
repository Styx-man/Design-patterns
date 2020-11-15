package ru.styxman.patterns.hw.eight;

/**
 * Triangle.
 */
public class Triangle implements Shape {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    // Before apply Visitor pattern
/*    @Override
    public void draw() {
        System.out.println("Draw triangle with base A = " + a + " and base B = " + b + " and base C = " + c);
    }

    @Override
    public void getArea() {
        double p = (double) (a + b + c) / 2; // half-perimeter
        double h = 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c)) / a; // height
        double area = h * a / 2;
        System.out.println("Triangle area = " + area);
    }

    @Override
    public void getPerimeter() {
        int perimeter = a + b + c;
        System.out.println("Triangle perimeter = " + perimeter);
    }

    @Override
    public void getVolume() {
        System.out.println("Triangle has no volume");
    }
    */

    // After apply Visitor pattern
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
