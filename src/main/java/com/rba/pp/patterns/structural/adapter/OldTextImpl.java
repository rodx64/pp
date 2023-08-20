package com.rba.pp.patterns.structural.adapter;

public class OldTextImpl implements OldText {
    @Override
    public String format(String text) {
        return text.replace(".", "\n");
    }

}
