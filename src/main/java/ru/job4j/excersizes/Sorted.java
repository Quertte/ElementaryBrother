package ru.job4j.excersizes;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
