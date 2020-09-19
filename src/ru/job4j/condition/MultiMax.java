package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int a = first > second ? first : second;
        return a > third ? a : third;
    }
}
