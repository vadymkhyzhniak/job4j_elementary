package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean check = left > right;
        int result = check ? left : right;
        return result;
    }
}
