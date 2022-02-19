package ru.job4j.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.Ножницы);
        friend1Action.add(Action.Бумага);
        friend1Action.add(Action.Ножницы);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.Бумага);
        friend2Action.add(Action.Камень);
        friend2Action.add(Action.Камень);

        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);
    }
}

enum Action {
    Камень, Ножницы, Бумага;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.Камень && friendAction == Action.Ножницы)
                || (myAction == Action.Ножницы && friendAction == Action.Бумага)
                || (myAction == Action.Бумага && friendAction == Action.Камень)) {
            System.out.println(name + " wins");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}