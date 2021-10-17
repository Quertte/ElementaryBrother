package ru.job4j.excersizes;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = data[src];
        int[] temp1 = data[dst];
        data[src] = temp1;
        data[dst] = temp;
    }
}
