package ru.job4j.footbal;

import java.util.Random;

public class Play {
    private int id;

    public void countGoals(Team team) {
        Random random = new Random();
        team.setScores(random.nextInt(5));
    }
}
