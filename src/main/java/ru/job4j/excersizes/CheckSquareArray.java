package ru.job4j.excersizes;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        for (int[] ints : array) {
            if (ints.length != array.length) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
