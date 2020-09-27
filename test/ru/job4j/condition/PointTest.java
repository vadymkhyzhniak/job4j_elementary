package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
            int expected = 2;
            Point a = new Point(0, 0);
            Point b = new Point(2, 0);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to70then7() {
        int expected = 7;
        Point a = new Point(0, 0);
        Point b = new Point(7, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to3n2then5dot1() {
        double expected = 5.1;
        Point a = new Point(4, 3);
        Point b = new Point(3, -2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to46then3() {
        int expected = 3;
        Point a = new Point(4, 3);
        Point b = new Point(4, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when431to987then() {
        double expected = 9.27;
        Point a = new Point(4, 3, 1);
        Point b = new Point(9, 8, 7);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}