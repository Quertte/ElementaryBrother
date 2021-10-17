package ru.job4j.excersizes;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == 2) {
                    array[count++] = data[i][j];
                }
            }
        }
        return array;
    }
}
