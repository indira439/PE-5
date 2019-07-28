package com.stackroute.pe5;
/**
 * Write a program to find the number of counts in the following String. Store the output in
 * Map<String,Integer> as key value pair.
 * Input : String str = “one one -one___two,,three,one @three*one?two”;
 * Output : {"one":5 , "two":2, "three" :2}
 */

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWord {
    public Map<String, Integer> countOccurrences(String inputString) {

        /**Hash map to store the frequency of element*/
        Map<String, Integer> map = new HashMap<String, Integer>();

        String[] stringArray = inputString.trim().split("\\W|_| ");

        for (String string : stringArray) {
            Integer integer= map.get(string);
            map.put(string, (integer == null) ? 1 : integer + 1);
        }
        return map;
    }
}
