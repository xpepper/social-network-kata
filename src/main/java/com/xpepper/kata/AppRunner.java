package com.xpepper.kata;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppRunner {
    public static void main(String[] args) {
        try (BufferedReader reader = consoleReader()) {
            while (true) {
                String inputCommand = reader.readLine();
                System.out.println(inputCommand);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedReader consoleReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
