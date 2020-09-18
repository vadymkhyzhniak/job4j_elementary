package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 350;
        int expected = 5;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("350 rubles are 5 euros. Test result : " + passed);
        in = 360 ;
        expected = 6;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("350 rubles are 6 dollars. Test result : " + passed);
    }
}
