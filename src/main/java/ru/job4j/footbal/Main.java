package ru.job4j.footbal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        //   System.out.println("Введите температуру: ");
        //   int temperature = scanner.nextInt();
        Team team = new Team("Iluxa");
        Team team1 = new Team("Andrew");
        Team team2 = new Team("Serega");
        Team team3 = new Team("Petya");

        List<Team> teams = new ArrayList<>();
        teams.add(team);
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        Random random = new Random();
        Team home1 = teams.remove(random.nextInt(teams.size()));
        Team guest1 = teams.remove(random.nextInt(teams.size()));
        Team home2 = teams.remove(random.nextInt(teams.size()));
        Team guest2 = teams.remove(random.nextInt(teams.size()));

        //      System.out.println(home1 + "    " + guest1 + "     " + home2 + "     " + guest2);
        Play play = new Play();
        play.countGoals(home1);
        play.countGoals(guest1);
        if (home1.getScores() < guest1.getScores()) {
            home1.setLoses(home1.getLoses() + ++value);
            guest1.setWins(guest1.getWins() + value);
        } else if (home1.getScores() > guest1.getScores()) {
            home1.setWins(home1.getWins() + ++value);
            guest1.setLoses(guest1.getLoses() + value);
        } else {
            home1.setTies(home1.getTies() + ++value);
            guest1.setTies(guest1.getTies() + value);
        }

        value = 0;

        play.countGoals(home2);
        play.countGoals(guest2);
        if (home2.getScores() < guest2.getScores()) {
            home2.setLoses(home2.getLoses() + ++value);
            guest2.setWins(guest2.getWins() + value);
        } else if (home2.getScores() > guest2.getScores()) {
            home2.setWins(home2.getWins() + ++value);
            guest2.setLoses(guest2.getLoses() + value);
        } else {
            home2.setTies(home2.getTies() + ++value);
            guest2.setTies(guest2.getTies() + value);
        }


        System.out.println(home1 + "\n" + guest1);
        System.out.println(home2 + "\n" + guest2);
    }
}
