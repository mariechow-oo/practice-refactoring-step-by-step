package com.afs.refactoring;

public class Police {

    public static final int LEGAL_AGE = 18;

    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= LEGAL_AGE;
    }
}
