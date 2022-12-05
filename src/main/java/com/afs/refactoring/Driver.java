package com.afs.refactoring;

public class Driver {
    public int age;
    public static final int ADULT_AGE = 18;

    public Driver(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }
}
