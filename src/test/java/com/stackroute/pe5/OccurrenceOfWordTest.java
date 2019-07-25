package com.stackroute.pe5;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class OccurrenceOfWordTest {

    OccurrenceOfWord occurrenceOfWord;

    @Before
    public void setUp() {
        this.occurrenceOfWord = new OccurrenceOfWord();
    }

    @After
    public void tearDown() {
        occurrenceOfWord = null;
    }

    @Test
    public void givenStringShouldReturnCountOfEachWordAsKeyValuePairs() {
        //act
        Map<String, Integer> expectedResult = new TreeMap<>();
        expectedResult.put("one", 5);
        expectedResult.put("two", 2);
        expectedResult.put("three", 2);
        //assert
        assertEquals(expectedResult, occurrenceOfWord.countOccurrences("one one -one___two,,three,one @three*one?two”"));
    }

    @Test
    public void givenStringShouldReturnCountOfEachWordAsKeyValuePairsFailure() {
        //act
        Map<String, Integer> expectedResult = new TreeMap<>();
        expectedResult.put("one", 5);
        expectedResult.put("two", 2);
        expectedResult.put("three", 1);
        //assert
        assertNotEquals(expectedResult, occurrenceOfWord.countOccurrences("one one -one___two,,three,one @three*one?two"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        occurrenceOfWord.countOccurrences(null);
    }


}