package com.afs.refactoring;

public class Police {

    public static final int LEGAL_AGE = 18;

    public boolean checkDriver(Driver driver) {
        if(driver.age >= LEGAL_AGE) return true;
        else return false;
    }
}
