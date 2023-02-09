package com.example.sandboxforspring;

public class MultithreadingExperiment extends Thread {
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
