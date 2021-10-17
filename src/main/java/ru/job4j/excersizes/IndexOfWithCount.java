package ru.job4j.excersizes;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rls = -1;
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                ++count;
                rls = i;
            }
        }
        return number == count ? rls : -1;
    }
}
