package ru.job4j.excersizes;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            string[i] = Character.isLowerCase(string[i]) && Character.isLetter(string[i])
                    ?
                    Character.toUpperCase(string[i]) : string[i];
        }
        return string;
    }
}
