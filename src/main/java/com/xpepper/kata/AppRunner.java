package com.xpepper.kata;

import java.io.Console;

public class AppRunner {
    public static void main(String[] args) {
        Console console = System.console();

        while (true) {
            String inputCommand = console.readLine();
            System.out.println(inputCommand);
        }
    }
}
