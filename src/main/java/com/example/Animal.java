package com.example;

import java.util.List;

import static com.example.constants.Constants.*;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if (HERBIVORE.equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if (PREDATOR.equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception(ANIMALS_EXCEPTION);
        }
    }

    public String getFamily() {
        return ANIMALS_FAMILY;
    }
}