package ru.job4j.excersizes;

public class NumberToArray {
    public static int[] resolve(int number) {
        String[] result = String.valueOf(number).split("");
        int[] rsl = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            rsl[i] = Integer.parseInt(result[result.length - 1 - i]);
        }
        return rsl;
    }
}
