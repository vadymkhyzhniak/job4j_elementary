package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {

        double p = (a + b + c) / 2;
        double r1 = p - a;
        double r2 = p - b;
        double r3 = p - c;
        double r4 = p*r1*r2*r3;
        double rsl = Math.sqrt(r4);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

}
