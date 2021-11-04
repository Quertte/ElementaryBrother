package ru.job4j.excersizes;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] > el ? array[i][j] - el : 0;
            }
        }
        return array;
    }
}
