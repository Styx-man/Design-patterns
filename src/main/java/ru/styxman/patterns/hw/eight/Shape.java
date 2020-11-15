package ru.styxman.patterns.hw.eight;

/**
 * Shape.
 */
public interface Shape {

    // Before apply Visitor pattern
/*
    void draw();

    void getArea();

    void getPerimeter();

    void getVolume();
*/

    // After apply Visitor pattern
    void accept(Visitor visitor);
}
