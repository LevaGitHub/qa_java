package com.example;

//import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.Spy;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.Constants.*;


@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    private Animal animal = new Animal();

    @Test
    public void testHerbivore() throws Exception {
        Assert.assertEquals(
                HERBIVORE_FOOD,
                animal.getFood(HERBIVORE).toString());
    }

    @Test
    public void testPredator() throws Exception {
        Assert.assertEquals(
                PREDATOR_FOOD,
                animal.getFood(PREDATOR).toString());
    }

    @Test
    public void testInsects() throws Exception {
        try {
            animal.getFood(WRONG).toString();
        } catch(Exception e) {
            String exception = e.toString();
            System.out.println(exception);  // java.lang.ArrayIndexOutOfBoundsException: 10
            Assert.assertEquals(
                    "java.lang.Exception: " + ANIMALS_EXCEPTION,
                    exception);
        }
    }

    @Test
    public void testGetFamily() throws Exception {
        Assert.assertEquals(
                ANIMALS_FAMILY,
                animal.getFamily());
    }

}
