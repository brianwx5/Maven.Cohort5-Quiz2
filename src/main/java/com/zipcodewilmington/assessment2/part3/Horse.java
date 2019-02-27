package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{


    @Override
    public String color() {
        return "brown";
    }

    @Override
    public int getSpeed() {
        return 40;
    }

    public String move() {return "gallop";}
}
