package com.example;

import java.util.List;

import static com.example.constants.Constants.FELINE;
import static com.example.constants.Constants.PREDATOR;

// Кошачьи
public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood(PREDATOR);
    }

    @Override
    public String getFamily() {
        return FELINE;
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
