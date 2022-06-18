package ru.job4j.footbal;

public class Team {
    private String name;
    private int countOfGoalsForGame;
    private int wins, loses, ties;
    private int scores;
    private int countGames;

    public Team(String name) {
        this.name = name;
    }

    public void setCountOfGoalsForGame(int countOfGoalsForGame) {
        this.countOfGoalsForGame = countOfGoalsForGame;
    }

    public int getCountOfGoalsForGame() {
        return countOfGoalsForGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public int getCountGames() {
        return countGames;
    }

    public void setCountGames(int countGames) {
        this.countGames = countGames;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", wins=" + wins +
                ", loses=" + loses +
                ", ties=" + ties +
                ", scores=" + scores +
                ", countGames=" + countGames +
                '}';
    }
}
