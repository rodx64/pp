package com.rba.pp.patterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldTextImplTest {

    @Test
    public void testFormatText() throws Exception {
        String str="Format line 1.Format line 2.Format line 3.Format line 4.Format line 5.";
        OldText oldText = new OldTextImpl();
        String oldFormat = oldText.format(str);
        System.out.println(oldFormat);

        NewTextAdapter adapter = new NewTextAdapter(new NewTextImpl());
        String newFormat = adapter.format(str);
        System.out.println(newFormat);
        assertEquals("format line 1;format line 2;format line 3;format line 4;format line 5;", newFormat);
    }
}
