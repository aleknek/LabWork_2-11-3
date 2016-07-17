package com.brainacad.oop.testexcp1;

public class InvalidAgeException extends RuntimeException {

    @Override
    public String toString() {
        return "Invalid age. Age should be in the range 1-120";
    }
}
