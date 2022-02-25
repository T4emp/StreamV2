package com.xwx;

import java.util.ArrayDeque;
import java.util.Queue;

public class Buffer {
    private Queue <String> buffer2 = new ArrayDeque<>();

    public synchronized void add(String i) {
        buffer2.add(i);
    }

    public String get() {
        return buffer2.poll();
    }
}