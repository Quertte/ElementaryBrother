package ru.job4j.excersizes;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        int length = 2;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                count++;
            }
        }
        int[] mas = new int[count];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                mas[num++] = array[i][j];
            }
        }
        for (int i = 2; i < mas.length; i++) {
            if (i * i < mas.length) {
                length++;
            }
        }
        int k = 0;
        int[][] rsl = new int[length][length];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                rsl[i][j] = k >= mas.length ? 0 : mas[k++];
            }
        }
        return rsl;
    }
}
