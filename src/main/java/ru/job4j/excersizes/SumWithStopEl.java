package ru.job4j.excersizes;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int datum : data) {
            if (datum == el) {
                break;
            }
            sum += datum;
        }
        return sum % 2 == 0 ? sum : 0;
    }
}
