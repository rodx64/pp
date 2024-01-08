package com.rba.pp.patterns.structural.adapter;

public class NewTextAdapter implements OldText{
    private NewTextImpl newText;

    public NewTextAdapter(NewTextImpl newText){
        this.newText = newText;
    }

    @Override
    public String format(String text) {
        return newText.newFormat(text);
    }
}
