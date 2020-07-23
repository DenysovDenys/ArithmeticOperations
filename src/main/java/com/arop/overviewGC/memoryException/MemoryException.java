package com.arop.overviewGC.memoryException;

public class MemoryException {
    private static final int millis = 999999999;

    public static void runOutMemory() {
        while (true) {
            new Thread(() -> {
                try {
                    System.out.println("Process started...");
                    Thread.sleep(millis);
                } catch (Exception ignored) {
                    System.out.println("Error called!");
                }
            }).start();
        }
    }
}
