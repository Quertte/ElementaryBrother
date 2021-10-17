package ru.job4j.excersizes;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int count = 0;
        for (int[] datum : data) {
            for (int i : datum) {
                array[count++] = i;
            }
        }
        return array;
    }
}
