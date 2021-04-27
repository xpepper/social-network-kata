package com.xpepper.kata.socialnetwork.adapter;

import com.xpepper.kata.socialnetwork.domain.LineReader;
import com.xpepper.kata.socialnetwork.domain.LineWriter;

import java.io.Console;

public class CommandLineConsole implements LineReader, LineWriter {
    private final Console console = System.console();

    @Override
    public String readLine() {
        return console.readLine();
    }

    @Override
    public void writeLine(String line) {
        console.writer().println(line);
    }
}
