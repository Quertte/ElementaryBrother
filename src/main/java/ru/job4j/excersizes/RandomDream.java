package ru.job4j.excersizes;

public class RandomDream {

    public static String random(String[] prizes, int num) {
        while (num > prizes.length) {
            num -= prizes.length;
        }
        return prizes[num - 1];
    }
}
