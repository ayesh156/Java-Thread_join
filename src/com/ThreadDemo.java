package com;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThreads extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("MyThreads");
                Thread.sleep(3 * 1000);
            } catch (InterruptedException ex) {
                System.out.println("Getting Interrupted Exception");
            }
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception");
        }
        t2.start();
    }
}
