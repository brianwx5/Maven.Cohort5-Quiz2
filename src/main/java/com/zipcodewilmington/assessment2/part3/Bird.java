package com.zipcodewilmington.assessment2.part3;

public class Bird implements Animal {
    public String move() {
        return "fly";
    }

    public void setMigrationMonth(String expected) {

    }

    public String getMigrationMonth() {
        return null;
    }

    @Override
    public String color() {
        return null;
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
