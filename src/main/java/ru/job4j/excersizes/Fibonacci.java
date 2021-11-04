package ru.job4j.excersizes;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        int sum = data[0] + data[1];
        for (int i = 2; i < data.length; i++) {
            if (sum != data[i]) {
                rsl = false;
                break;
            }
            sum += data[i - 1];
        }
        return rsl;
    }
}
