package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class OccurrenceOfStringTest {

    OccurrenceOfString occurrenceOfString;
    @Before
    public void setUp() {
        occurrenceOfString = new OccurrenceOfString();
    }

    @After
    public void tearDown() {
        occurrenceOfString = null;
    }

    @Test
    public void givenStringArrayShouldReturnOccurrenceOfEachStringAsKeyValuePair() {
        //act
        String[] strings = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedResult = new TreeMap<>();
        expectedResult.put("a", true);
        expectedResult.put("b", false);
        expectedResult.put("c", true);
        expectedResult.put("d", false);
        //assert
        assertEquals(expectedResult, occurrenceOfString.countStringOccurrence(strings));
    }

    @Test
    public void givenStringArrayShouldReturnOccurrenceOfEachStringAsKeyValuePairFailure() {
        //act
        String[] strings = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> expectedResult = new TreeMap<>();
        expectedResult.put("a", true);
        expectedResult.put("d", false);
        expectedResult.put("c", true);
        //assert
        assertNotEquals(expectedResult, occurrenceOfString.countStringOccurrence(strings));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNullPointerException() {
        occurrenceOfString.countStringOccurrence(null);
    }

}