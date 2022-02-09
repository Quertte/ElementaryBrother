package ru.job4j.excersizes;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sumFirstTeam = 0;
        int sumSecondTeam = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sumFirstTeam += players[i];
            } else {
                sumSecondTeam += players[i];
            }
        }
        return sumFirstTeam > sumSecondTeam
                ? 1 : sumFirstTeam == sumSecondTeam
                ? 0 : 2;
    }
}
