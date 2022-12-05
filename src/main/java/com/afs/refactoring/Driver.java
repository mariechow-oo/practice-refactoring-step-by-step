package com.afs.refactoring;

public class Driver {
    private final int age;
    private static final int ADULT_AGE = 18;

    public Driver(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }
}
