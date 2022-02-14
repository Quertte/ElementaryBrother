package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int val = array[row][column], i = row, j = column;
        while (i > 0) {
            int value = array[--i][j];
            array[i][j] = val;
            val = value;
        }
        i = row;
        val = array[row][column];
        while (i + 1 < array.length) {
            int value = array[++i][j];
            array[i][j] = val;
            val = value;
        }
        i = row;
        val = array[row][column];
        while (j > 0) {
            int value = array[i][--j];
            array[i][j] = val;
            val = value;
        }
        j = column;
        val = array[row][column];
        while (j + 1 < array.length) {
            int value = array[i][++j];
            array[i][j] = val;
            val = value;
        }
        array[row][column] = 0;
    }
}
