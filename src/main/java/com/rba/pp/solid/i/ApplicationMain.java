package com.rba.pp.solid.i;

public class ApplicationMain {
    public static void main(String[] args) {
        Bird crown = new Crown();
        Bird penguim = new Penguim();
        crown.sing();
        ((Crown) crown).fly();
        penguim.sing();
    }

}
