package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    @SuppressWarnings("checkstyle:InnerAssignment")
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int l, r;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                r = l = i;
                count++;

                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] <= down || data[j] >= up) {
                        i = j;
                        r++;
                    } else {
                        break;
                    }
                }
                result[count - 1] = new int[]{l, r};
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        System.out.println(Arrays.deepToString(found(data, up, down)));
    }
}
