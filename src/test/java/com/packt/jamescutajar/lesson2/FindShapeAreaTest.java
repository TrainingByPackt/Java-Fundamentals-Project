package com.packt.jamescutajar.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindShapeAreaTest {


    @Test
    public void testSquareArea1() {
        assertEquals(1, new FindShapeArea().squareArea(1), "Area of a square of side 1 unit should be 1");
    }

    @Test
    public void testSquareArea3() {
        assertEquals(9, new FindShapeArea().squareArea(3), "Area of a square of side 3 unit should be 9");
    }


    @Test
    public void testSquareArea10() {
        assertEquals(100, new FindShapeArea().squareArea(10), "Area of a square of side 10 units should be 100");
    }

    @Test
    public void testCircleArea1() {
        double area = new FindShapeArea().circleArea(1);
        assertEquals(31415, (int) (area * 10000), "Area of a circle of side 1 unit should be 3.1415");
    }

    @Test
    public void testCircleArea2() {
        double area = new FindShapeArea().circleArea(2);
        assertEquals(125663, (int) (area * 10000), "Area of a circle of side 1 unit should be 12.5663");
    }

    @Test
    public void testCircleArea5() {
        double area = new FindShapeArea().circleArea(5);
        assertEquals(785398, (int) (area * 10000), "Area of a circle of side 1 unit should be 78.5398");
    }

    @Test
    public void testRightAngleTriangleArea2By1() {
        double area = new FindShapeArea().rightAngleTriangleArea(2, 1);
        assertEquals(10000, (int) (area * 10000), "Area of a right angle triangle with a height of 2 and base 1 should be 1");
    }

    @Test
    public void testRightAngleTriangleArea5By3() {
        double area = new FindShapeArea().rightAngleTriangleArea(5, 3);
        assertEquals(75000, (int) (area * 10000), "Area of a right angle triangle with a height of 5 and base 3 should be 7.5");
    }

    @Test
    public void testRightAngleTriangleArea21By91() {
        double area = new FindShapeArea().rightAngleTriangleArea(21, 91);
        assertEquals(9555000, (int) (area * 10000), "Area of a right angle triangle with a height of 21 and base 91 should be 955.5");
    }
}
