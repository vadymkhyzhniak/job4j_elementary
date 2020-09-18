package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
            int expected = 2;
            int x1 = 0;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to70then7() {
        int expected = 7;
        int x1 = 0;
        int y1 = 0;
        int x2 = 7;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to3n2then5dot1() {
        double expected = 5.1;
        int x1 = 4;
        int y1 = 3;
        int x2 = 3;
        int y2 = -2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to46then3() {
        int expected = 3;
        int x1 = 4;
        int y1 = 3;
        int x2 = 4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}