package com.xwx;

import java.io.*;

public class Thread1 extends Thread {
    private final Buffer buffer2;

    public Thread1(Buffer buffer) {
        buffer2 = buffer;
    }

    @Override
    public void run() {
        try {
            Read();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void Read() throws IOException, InterruptedException {
        while (true) {
            String i;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
            while ((i = bufferedReader.readLine()) != null) {
                buffer2.add(i);
                sleep(400);
            }
        }
    }
}