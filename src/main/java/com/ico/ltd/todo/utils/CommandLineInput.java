package com.ico.ltd.todo.utils;

import java.util.HashMap;
import java.util.Map;

public enum CommandLineInput {
    FIND_ALL('a'), FIND_BY_ID('f'), DELETE('d'),
    INSERT('i'), UPDATE('u'), EXIT('e');

    private static final Map<Character, CommandLineInput> INPUTS;

    static {
        INPUTS = new HashMap<>();
        for (CommandLineInput input : values()) {
            INPUTS.put(input.getShortCmd(), input);
        }
    }

    private final char shortCmd;

    CommandLineInput(char shortCmd) {
        this.shortCmd = shortCmd;
    }

    public char getShortCmd() {
        return shortCmd;
    }

    public static CommandLineInput getCommandLineInputForInput(char input) {
        return INPUTS.get(input);
    }
}
