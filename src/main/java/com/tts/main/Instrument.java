package com.tts.main;

//abstract classes allow us to utilise contractual obligatiojns
//and class based inheritance
public abstract class Instrument {
    public String name;
    public String type;

    public abstract void createSound();
}
