package ru.job4j.excersizes;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = 2;
        for (int i = 2; i < array.length; i++) {
            if (i * i < array.length) {
                length++;
            }
        }
        int k = 0;
        int[][] mas = new int[length][length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = k >= array.length ? 0 : array[k++];
            }
        }
        return mas;
    }
}
