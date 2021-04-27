package com.xpepper.kata.socialnetwork.configuration;

import com.xpepper.kata.socialnetwork.adapter.CommandLineConsole;

public class AppRunner {
    public static void main(String[] args) {
        CommandLineConsole console = new CommandLineConsole();

        while (true) {
            String inputCommand = console.readLine();
            console.writeLine(inputCommand);
        }
    }
}

