package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean rs = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != rs) {
                result = false;
                break;
            }
        }
        return result;
    }
}
