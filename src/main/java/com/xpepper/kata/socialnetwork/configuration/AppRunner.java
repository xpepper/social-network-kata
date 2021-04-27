package com.xpepper.kata.socialnetwork.configuration;

import com.xpepper.kata.socialnetwork.adapter.CommandLineConsole;
import com.xpepper.kata.socialnetwork.adapter.SocialNetworkRunner;

@SuppressWarnings("InfiniteLoopStatement")
public class AppRunner {
    public static void main(String[] args) {
        CommandLineConsole console = new CommandLineConsole();
        SocialNetworkRunner socialNetworkRunner = new SocialNetworkRunner(console, console);

        while (true) {
            socialNetworkRunner.run();
        }
    }
}

