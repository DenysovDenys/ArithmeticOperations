package com.arop.сoncurrency.executor;

import com.arop.сoncurrency.semaphore.Semaphore;

public class ExecuteManager {
    public static void runProgram() {
        Semaphore selfServiceArea = new Semaphore(4);
        Runnable buyerBehavior = () -> {
            try {
                selfServiceArea.acquire();
                System.out.println("Buying something...");
                Thread.sleep(2000);
                System.out.println("Purchase completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            selfServiceArea.release();
        };
        for (int i = 0; i < 10; i++) {
            new Thread(buyerBehavior).start();
        }
    }
}
