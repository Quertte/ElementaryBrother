package ru.job4j.excersizes;

public class Board {
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }
}
