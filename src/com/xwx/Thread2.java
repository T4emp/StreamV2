package com.xwx;

public class Thread2 extends Thread {
    private final Buffer buffer2;

    public Thread2(Buffer buffer) {
        buffer2 = buffer;
    }

    @Override
    public void run() {
        try {
            SoutBuf();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void SoutBuf() throws InterruptedException {
        sleep(10);
        while (true) {
            String i;
            while ((i = buffer2.get()) != null) {
                sleep(400);
                System.out.println(i);
            }
        }
    }
}