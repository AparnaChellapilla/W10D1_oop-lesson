package com.tts.main.enumeration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    public static void checkDay(Day day){
        switch(day){
            case MONDAY -> System.out.println("Waking up on Monday's are crazy");
            case FRIDAY -> System.out.println("Fridays is what i long for");
            case SATURDAY,SUNDAY -> System.out.println("Weekends are to relax and get time to do what you enjoy most");
            default-> System.out.println("midweeks are so-so");
        }
    }

    @Test
    void test(){
        checkDay(Day.SATURDAY);
    }

}