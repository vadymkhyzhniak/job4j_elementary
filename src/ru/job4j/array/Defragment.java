package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int index2 = 0; point + index2 < array.length; index2++) {
                    if (array[point + index2] != null) {
                        // через готовый SwitchArray.swap() не получится, потому что в том задании числа были, а здесь текст
                        String temp = array[point];
                        array[point] = array[point + index2];
                        array[point + index2] = temp;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}