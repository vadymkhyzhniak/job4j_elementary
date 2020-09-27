package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean check = first > second;
        int result = check ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        boolean check = max(first, second) > third;
        int result = check ? max(first, second) : third;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        boolean check = max(first, second, third) > fourth;
        int result = check ? max(first, second, third) : fourth;
        return result;
    }
}
