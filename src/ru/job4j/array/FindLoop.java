package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst2 = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst2 = index;
                break;
            }
        }
        return rst2;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst4 = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst4 = index;
                break;
            }
        }
        return rst4;
    }
}

