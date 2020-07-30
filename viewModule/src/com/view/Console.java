package com.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Console {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public abstract void show();

    public abstract void choice();

    public int select() {
        String input = inputReader();
        if (input.matches("\\d") || input.matches("\\d{2}")) {
            return Integer.parseInt(input);
        } else {
            System.out.println("Incorrect input");
            return -1;
        }
    }

    public String inputReader() {
        String input = null;
        try {
            input = READER.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return input;
    }
}
