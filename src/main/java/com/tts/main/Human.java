package com.tts.main;
import java.util.List;

public class Human extends Animal implements Walkable,Communicatible {

    @Override
    public void doWalk() {
        System.out.println("The bear is walking...");
    }


    @Override
    public void doCommunication() {
        System.out.println("This human spoke");
    }
}

