package ru.job4j.excersizes;

public class SquareArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
