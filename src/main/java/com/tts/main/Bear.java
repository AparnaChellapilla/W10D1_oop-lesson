package com.tts.main;
import java.lang.*;

public class Bear extends Animal implements Walkable, Communicatible {
    @Override
    public void doWalk() {
        System.out.println("The bear is walking...");
    }

    @Override
    public void doCommunication() {

        System.out.println("The bear enjoys honey");
    }

    @Override
    public void doEat() {
        //below is the original auto implementation
        System.out.println("This Animal ate");
    }
}
