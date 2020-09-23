package ru.job4j.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int newM = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (COINS[i] <= newM) {
                rsl[size] = COINS[i];
                newM -= COINS[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
