package com.lits.hw11;

public class MyThread implements Runnable {

    /* volatile - ключове слово щоб дані змінної минали кеш і
    записувались в RAM для актуальності даних для інших потоків */
    volatile static int data;

    /* synchronized - щоб один потік виконувався а інші чекали поки він виконається */
    public synchronized void statusCar(Thread name, int data) {
        this.data = data + 1;
        System.out.println(name + " data: " + data);
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            for (int i = 0; i <5 ; i++) {
                statusCar(Thread.currentThread(), data);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
