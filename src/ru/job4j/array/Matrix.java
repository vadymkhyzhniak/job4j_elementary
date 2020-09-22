package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int indexr = 1; indexr <= size; indexr++) {
            for (int indexc = 1; indexc <= size; indexc++) {
                table[indexr - 1][indexc - 1] = indexr * indexc;
            }
        }
        return table;
    }
}
