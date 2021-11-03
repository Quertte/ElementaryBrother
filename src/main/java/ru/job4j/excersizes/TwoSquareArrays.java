package ru.job4j.excersizes;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] array = new int[left.length * right.length];
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                array[k++] = Math.max(left[i][j], right[i][j]);
            }
        }
        return array;
    }
}
