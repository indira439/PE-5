package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedSetTest {

    SortedSet sortedSet;

    @Before
    public void setUp() {
        sortedSet = new SortedSet();
    }

    @After
    public void tearDown() {
        sortedSet = null;
    }

    @Test
    public void givenRandomlyNamesShouldReturnSortedSetAsArrayList() {
        //act
        String inputString = "Harry Olive Alice Bluto Eugene";

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");

        //assert
        assertEquals(expectedResult, sortedSet.sortElements(inputString));
    }

    @Test
    public void givenRandomlyNamesShouldReturnSortedSetAsArrayListFailure() {
        //act
        String inputString = "Harry Olive Alice Bluto Eugene";

        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Olive");

        //assert
        assertNotEquals(expectedResult, sortedSet.sortElements(inputString));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        sortedSet.sortElements(null);
    }

    @Test
    public void givenEmptyInputShouldThrowNull() {
        //assert
        assertEquals(null,sortedSet.sortElements(""));
    }

    @Test
    public void givenBlankInputShouldThrowNull() {
        //assert
        assertEquals(null,sortedSet.sortElements("  "));
    }
}