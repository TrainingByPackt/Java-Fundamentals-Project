package com.packt.jamescutajar.lesson2;

import java.util.Scanner;

/**
 * Exercise for Lesson 2.
 * Implement the three methods as explained in the material accompanying this course
 */
public class FindShapeArea {
    public int squareArea(int side) {
        return side * side;
    }

    public double circleArea(int radius) {
        return radius * radius * Math.PI;
    }

    public double rightAngleTriangleArea(int height, int base) {
        return (height * base) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 to find the area inside a square, 2 for circle and 3 for right angle triangle.");
        Scanner scanner = new Scanner(System.in);
        FindShapeArea findShapeArea = new FindShapeArea();
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Enter the length of the side of the square in integer units");
                System.out.println("The area total area of the square is " + findShapeArea.squareArea(scanner.nextInt()));
                break;
            case 2:
                System.out.println("Enter the radius of the circle in integer units");
                System.out.println("The area total area of the circle is " + findShapeArea.circleArea(scanner.nextInt()));
                break;
            case 3:
                System.out.println("Enter the base length of the triangle in integer units");
                int base = scanner.nextInt();
                System.out.println("Enter the hypotenuse length of the triangle in integer units");
                int hyp = scanner.nextInt();
                System.out.println("The area total area of the triangle is " + findShapeArea.rightAngleTriangleArea(base, hyp));
                break;
            case 4:
                System.out.println("Invalid option");
        }
    }

}
