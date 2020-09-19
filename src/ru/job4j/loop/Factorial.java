package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {

        if (n >= 0) { // если не меньше нуля, то рассчитать факториал;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        return 0; // если негативное, то вернуть 0;
    }
}
