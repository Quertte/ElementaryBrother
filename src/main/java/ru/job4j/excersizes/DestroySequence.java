package ru.job4j.excersizes;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0, j = seq.length - 1; i < seq.length; i++, j--) {
            if (i < 5 && j > seq.length - 1 - 5) {
                seq[i] = '0';
                seq[j] = '1';
            }
        }
        return seq;
    }
}
