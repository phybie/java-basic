package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    boolean isSquare(){
        return width == height;
    }
}
