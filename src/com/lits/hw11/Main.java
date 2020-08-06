package com.lits.hw11;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread fd1 = new MyThread();
        MyThread fd2 = new MyThread();

        Thread carFirst = new Thread(fd1);
        Thread carSecond = new Thread(fd2);

        carFirst.start();               //  старт першого потоку

        carFirst.join(1500);      // зупинка потоку поки інший працює
        // carFirst.interrupt();        // зупинка потоку 1

        carSecond.start();
        carSecond.join(500);
        Thread.sleep(500);        // зупинка всіх потоків на N мілісекунд
        //carSecond.interrupt();        // зупинка потоку 2


    }
}
