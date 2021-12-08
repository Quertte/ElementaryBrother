package ru.job4j.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class OneZeroStream extends InputStream {
    private byte[] bytes = {49, 32, 48, 32};
    int i = 0;

    public int read() {
        if (i >= bytes.length) {
            i = 0;
        }
        return bytes[i++];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++) {
            System.out.print(scanner.nextInt());
        }

        byte[] array = {48, 36, 98};
        System.out.println(Arrays.toString(array));
    }
}
