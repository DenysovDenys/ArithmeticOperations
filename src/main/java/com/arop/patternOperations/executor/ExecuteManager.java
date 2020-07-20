package com.arop.patternOperations.executor;

import com.arop.patternOperations.Cake.Cake;

public class ExecuteManager {
    Cake kievCake;
    Cake panchoCake;

    public void runProgram() {
        kievCake = new Cake.Builder()
                .setName("Kiev cake")
                .setShortCakes("protein whipped")
                .setLayers(2)
                .setCream("butter")
                .setNuts("hazelnuts")
                .build();
        System.out.println(kievCake.toString());
        panchoCake = new Cake.Builder()
                .setName("Pancho cake")
                .setShortCakes("biscuit")
                .setLayers(3)
                .setCream("sour cream")
                .setFruits("pineapple")
                .build();
        System.out.println(panchoCake.toString());
    }
}
