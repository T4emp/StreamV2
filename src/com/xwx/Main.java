package com.xwx;

public class Main {

    public static void main(String[] args) {
        Buffer buffer1 = new Buffer();

        Thread1 thread1 = new Thread1(buffer1);
        Thread2 thread2 = new Thread2(buffer1);

        thread1.start();
        thread2.start();
    }
}