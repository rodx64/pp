package com.rba.pp.patterns.structural.adapter;

public class NewTextImpl implements NewText {
    @Override
    public String newFormat(String text) {
        return text.toLowerCase().replace(".", ";");
    }
}
