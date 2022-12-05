package com.afs.refactoring;

public class Police {

    public boolean checkDriver(Driver d) {
        if(d.age >= 18) return true;
        else return false;
    }
}
