package ru.job4j.excersizes;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] array = new int[data.length];
        int size = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                array[size++] = datum;
            }
        }
        return Arrays.copyOf(array, size);
    }
}
