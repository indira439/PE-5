package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapValuesTest {

    ModifyMapValues modifyMapValues;

    @Before
    public void setUp() {
        modifyMapValues = new ModifyMapValues();
    }

    @After
    public void tearDown() {
        modifyMapValues = null;
    }

    @Test
    public void givenMapObjectWithTwoKeyValuePairShouldReturnExchangedKeyValues() {
        //act
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("val1", "shiv");
        inputMap.put("val2", "indu");

        Map<String, String> expectedResult = new HashMap<>();
        expectedResult.put("val1", " ");
        expectedResult.put("val2", "shiv");
        //assert
        assertEquals(expectedResult, modifyMapValues.getModifiedMapValues(inputMap));
    }

    @Test
    public void givenMapObjectShouldReturnWithTwoKeyValuePairShouldReturnExchangedKeyValuesFailure() {
        //act
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("val1", "shiv");
        inputMap.put("val2", "indu");

        Map<String, String> expectedResult = new HashMap<>();
        expectedResult.put("val1", "indu");
        expectedResult.put("val2", "shiv");
        //assert
        assertNotEquals(expectedResult, modifyMapValues.getModifiedMapValues(inputMap));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNullPointerException() {
        modifyMapValues.getModifiedMapValues(null);
    }

}