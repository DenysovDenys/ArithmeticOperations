package com.arop.patternOperations.executor;

import com.arop.patternOperations.builder.cake.Cake;
import com.arop.patternOperations.singleton.cake.Tree;

import java.util.Objects;

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

        Tree oak = Tree.getInstance("Oak");
        System.out.println(oak.getName());
        Tree maple = Tree.getInstance("Maple");
        System.out.println(maple.getName());
        System.out.println(oak.equals(maple));
        System.out.println(Objects.equals(oak.hashCode(), maple.hashCode()));
    }
}
