package ru.job4j.multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("userthread");
        DemonThread thread = new DemonThread();
        thread.setName("demon");
        thread.setDaemon(true);
        System.out.println("Main thread ends");
        userThread.start();
        thread.start();
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon" + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon" + isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}