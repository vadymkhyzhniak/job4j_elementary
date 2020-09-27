package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean check = first > second;
        return check ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }
}
