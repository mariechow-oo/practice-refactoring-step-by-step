package com.afs.refactoring;

public class Police {
    private String id;

    public boolean checkDriver(Driver d) {
        if(d.age >= 18) return true;
        else return false;
    }
}
