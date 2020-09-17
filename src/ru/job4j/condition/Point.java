package ru.job4j.condition;

import java.sql.SQLOutput;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double r1 = x2 - x1;
        double r2 = y2 - y1;
        double r3 = Math.pow(r1, 2);
        double r4 = Math.pow(r2, 2);
        double r5 = r3 + r4;
        double rsl = Math.sqrt(r5);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double res = Point.distance(0, -2, 100, 23);
        System.out.println("result (0, -2) to (100, 23) " + res);
    }
}
