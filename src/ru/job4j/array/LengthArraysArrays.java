package ru.job4j.array;

public class LengthArraysArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 6}, {7, 8, 9}, {1, 2, 3, 4}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
