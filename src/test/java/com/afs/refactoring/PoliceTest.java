package com.afs.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    void should_return_true_when_check_driver_given_driver_age_is_18() {
        //given
        Driver driver = new Driver(18);

        //when
        boolean result = new Police().checkDriver(driver);

        //then
        assertTrue(result);
    }

    @Test
    void should_return_true_when_check_driver_given_driver_age_is_greater_than_18() {
        //given
        Driver driver = new Driver(20);

        //when
        boolean result = new Police().checkDriver(driver);

        //then
        assertTrue(result);
    }

    @Test
    void should_return_false_when_check_driver_given_driver_age_is_greater_than_16() {
        //given
        Driver driver = new Driver(16);

        //when
        boolean result = new Police().checkDriver(driver);

        //then
        assertFalse(result);
    }
}
