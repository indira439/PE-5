package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayTest {

    UpdateArray updateArray;

    @Before
    public void setUp() {
        updateArray = new UpdateArray();
    }

    @After
    public void tearDown() {
        updateArray = null;
    }

    @Test
    public void givenArrayShouldUpdateSpecificArrayElementByGivenElementAndReturn() {
        //act
        List<String> inputArray = new ArrayList<>();
        inputArray.add("Apple");
        inputArray.add("Grape");
        inputArray.add("Melon");
        inputArray.add("Berry");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Kiwi");
        expectedResult.add("Grape");
        expectedResult.add("Melon");
        expectedResult.add("Berry");
        //assert
        assertEquals(expectedResult, updateArray.updateArrayElement(inputArray, 0, "Kiwi"));
    }

    @Test
    public void givenArrayShouldUpdateSpecificArrayElementByGivenElementFailure() {
        //act
        List<String> inputArray = new ArrayList<>();
        inputArray.add("Apple");
        inputArray.add("Grape");
        inputArray.add("Melon");
        inputArray.add("Berry");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Apple");
        expectedResult.add("Grape");
        expectedResult.add("Mango");
        expectedResult.add("Berry");
        //assert
        assertNotEquals(expectedResult, updateArray.updateArrayElement(inputArray, 0, "Kiwi"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        updateArray.updateArrayElement(null, 0, "Kiwi");
    }

    @Test(expected = InvalidParameterException.class)
    public void givenInvalidIndexShouldThrowInvalidParameterException() {
        //act
        List<String> inputArray = new ArrayList<>();
        inputArray.add("Apple");
        inputArray.add("Grape");
        updateArray.updateArrayElement(inputArray, -1, "Goa");
    }

    @Test(expected = InvalidParameterException.class)
    public void givenEmptyArrayShouldThrowInvalidParameterException() {
        //act
        List<String> inputArray = new ArrayList<>();
//        inputArray.add("Apple");
//        inputArray.add("Grape");
        updateArray.updateArrayElement(inputArray, -9, "Goa");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void givenInvalidIndexShouldThrowIndexOutOfBoundsException() {
        //act
        List<String> inputArray = new ArrayList<>();
        inputArray.add("Apple");
        inputArray.add("Grape");
        updateArray.updateArrayElement(inputArray, 5, "Goa");
    }

    @Test
    public void givenArrayShouldReturnEmptyArrayList() {
        //act
        List<String> inputArray = new ArrayList<>();
        inputArray.add("Apple");
        inputArray.add("Grape");
        //assert
        assertEquals(null,updateArray.getArrayList());
    }


}