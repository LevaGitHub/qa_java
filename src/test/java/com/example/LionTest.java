package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.constants.Constants.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(MALE, feline);
        assertEquals( 1,
                    lion.getKittens());
        }

    @Test
    public void testGetFoodValue() throws Exception {
        when(feline.getFood(PREDATOR)).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(FEMALE, feline);
        assertEquals(
                PREDATOR_FOOD,
                lion.getFood().toString());
    }

    @Test
    public void testGetFoodCallMethod() throws Exception {
        Lion lion = new Lion(FEMALE, feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(PREDATOR);
    }

    @Test
    public void testSexException() {
        try {
            Lion lion = new Lion(WRONG, feline);
        } catch(Exception e) {
            String exception = e.toString();
            System.out.println(exception);
            Assert.assertEquals(
                    "java.lang.Exception: " + SEX_EXCEPTION,
                    exception);
        }
//       Второй вариант проверки исключения. Компактный, но не проверяет текст исключения
//        assertThrows(Exception.class, () -> new Lion(WRONG, feline));
    }

    @Test
    public void testHasMineMale() throws Exception{
        Lion lion = new Lion(MALE, feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testHasNoMineFemale() throws Exception{
        Lion lion = new Lion(FEMALE, feline);
        assertFalse(lion.doesHaveMane());
    }
}
