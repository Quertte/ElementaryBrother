package ru.job4j.excersizes;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = a + b;
        for (int i = 2; i < array.length; i++) {
            array[i] = sum;
            sum += array[i];
        }
        return array;
    }
}
