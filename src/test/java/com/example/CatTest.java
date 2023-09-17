package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.constants.Constants.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void testEatMeatValue() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(
                PREDATOR_FOOD,
                cat.getFood().toString());
    }

    @Test
    public void testEatMeatCallMethod() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testGetSound() throws Exception{
        Cat cat = new Cat(feline);
        assertEquals(
                CAT_SOUND,
                cat.getSound());
    }
}
