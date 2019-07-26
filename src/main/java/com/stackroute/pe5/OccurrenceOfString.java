package com.stackroute.pe5;
/**
 * Write a program where an array of strings is input and output is a Map<String,boolean> where
 * each different string is a key and its value is true if that string appears 2 or more times in the array
 * Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
 * Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */

import java.util.*;

public class OccurrenceOfString {
    public Map<String, Boolean> countStringOccurrence(String[] inputString) {

        /**Hash map to store the frequency of string*/
        Map<String, Boolean> map = new HashMap<>();
        List<String> stringList = Arrays.asList(inputString);
        boolean aBoolean = false;

        /**Loop through entire array and find occurrence of string*/
        for (String string : inputString) {
            if (!string.isEmpty()) {
                if (!map.containsKey(string)) {
                    if (Collections.frequency(stringList, aBoolean) >= 2) {
                        aBoolean = true;
                    }
                    /**Store the result in map and return it*/
                    map.put(string, aBoolean);
                }
            }
        }
        return map;
    }
}
