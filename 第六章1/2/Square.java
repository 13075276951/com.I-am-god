package com.apple.chaptersix2;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    void erase() {
        System.out.println("Square.erase()");

    }
}
