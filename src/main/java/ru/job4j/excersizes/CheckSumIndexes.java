package ru.job4j.excersizes;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] array = new int[data.length * data.length];
        int size = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    array[size++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(array, size);
    }
}
