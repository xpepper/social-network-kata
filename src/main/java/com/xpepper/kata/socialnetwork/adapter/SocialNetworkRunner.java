package com.xpepper.kata.socialnetwork.adapter;

import com.xpepper.kata.socialnetwork.domain.LineReader;
import com.xpepper.kata.socialnetwork.domain.LineWriter;

public class SocialNetworkRunner {
    private final LineReader lineReader;
    private final LineWriter lineWriter;

    public SocialNetworkRunner(LineReader lineReader, LineWriter lineWriter) {
        this.lineReader = lineReader;
        this.lineWriter = lineWriter;
    }

    public void run() {
        String inputCommand = lineReader.readLine();

        lineWriter.writeLine(inputCommand);
    }
}