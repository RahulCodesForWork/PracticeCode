package com.practice.PracticeCode;

public class ThreadUsingExtendThread extends Thread {

    @Override
    public void run() {
        int i=0;
        while (i<20) {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            i++;
        }
    }
}
