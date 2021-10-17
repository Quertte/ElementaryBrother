package ru.job4j.excersizes;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int[] array = new int[data.length];
        int[] array2 = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = data[i][src];
            array2[i] = data[i][dst];
        }

        for (int i = 0; i < data.length; i++) {
            data[i][dst] = array[i];
            data[i][src] = array2[i];
        }
    }
}
