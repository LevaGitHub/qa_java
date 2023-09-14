package com.example;

import java.util.List;

import static com.example.constants.Constants.*;

public class Lion {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if (MALE.equals(sex)) {
            this.hasMane = true;
        } else if (FEMALE.equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception(SEX_EXCEPTION);
        }
    }

    public int getKittens() {
        return this.feline.getKittens();
    }

    public boolean doesHaveMane() {
        return this.hasMane;
    }

    public List<String> getFood() throws Exception {
        return this.feline.getFood(PREDATOR);
    }
}
