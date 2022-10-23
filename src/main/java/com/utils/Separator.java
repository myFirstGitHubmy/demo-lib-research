package com.utils;

public enum Separator {
    SEMICOLON(";"),
    UNDERSCORE("_"),
    COLON(":");

    private final String title;

    Separator(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
