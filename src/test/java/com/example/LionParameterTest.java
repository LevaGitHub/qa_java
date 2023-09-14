package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import org.junit.Assert;
import org.mockito.internal.matchers.ArrayEquals;

import static com.example.constants.Constants.FEMALE;
import static com.example.constants.Constants.MALE;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterTest {
    private final String sexCode;
    private final boolean hasMine;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] getLionData() {

        return new Object[][]{
                {
                        MALE, true
                },
                {
                        FEMALE, false
                }
        };
    }

    public LionParameterTest(String sexCode, boolean hasMine) {
        this.sexCode = sexCode;
        this.hasMine = hasMine;
    }

    @Test
    public void testHasMine() throws Exception {
        Lion lion = new Lion(this.sexCode, feline);
        assertEquals(this.hasMine, lion.doesHaveMane());
        }
    }

