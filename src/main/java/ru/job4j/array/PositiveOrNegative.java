package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int count = 0;
        for (int datum : data) {
            if (datum < 0) {
                count++;
            }
        }
        return count % 2 != 0;
    }
}
