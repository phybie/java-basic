package oop1.ex;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("너비: ");
        rectangle.width = scanner.nextInt();
        System.out.print("높이: ");
        rectangle.height = scanner.nextInt();

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter);
        System.out.println("정사각형 여부: " + rectangle.isSquare());

    }
}
