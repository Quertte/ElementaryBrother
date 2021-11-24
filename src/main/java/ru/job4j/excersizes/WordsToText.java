package ru.job4j.excersizes;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append((i + 1) == words.length ? words[i] + "" : words[i] + " ");
        }
        return result.toString();
    }
}
