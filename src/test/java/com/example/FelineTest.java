package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.Constants.FELINE;
import static com.example.constants.Constants.PREDATOR_FOOD;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        assertEquals(
                PREDATOR_FOOD,
                feline.eatMeat().toString());
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testGetKittensWithoutParameter() throws Exception {
        assertEquals(
                1,
                feline.getKittens());
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testGetKittensWithParameter() throws Exception {
        assertEquals(
                1,
                feline.getKittens(1));
        Mockito.verify(feline, Mockito.times(0)).getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testGetFamily() throws Exception {
        assertEquals(
                FELINE,
                feline.getFamily());
        Mockito.verify(feline, Mockito.times(1)).getFamily();
    }
}
