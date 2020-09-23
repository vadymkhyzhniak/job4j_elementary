package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int nextNotNull = point + 1; nextNotNull < array.length; nextNotNull++) {
                    if (array[nextNotNull] != null) {
                        // через готовый SwitchArray.swap() не получится, потому что в том задании числа были, а здесь текст
                        String temp = array[point];
                        array[point] = array[nextNotNull];
                        array[nextNotNull] = temp;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}