package com.tts.main;
import java.lang.Override;

public class Piano extends Instrument{
    @Override
    public void createSound() {
        System.out.println("The piano is making sound!");
    }

}
