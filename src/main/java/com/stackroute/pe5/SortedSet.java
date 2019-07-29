package com.stackroute.pe5;
/**
 * Write a program to implement set interface which sorts the given randomly ordered names in
 * <p>
 * ascending order. Convert the sorted set in to an array list
 * Input : Harry Olive Alice Bluto Eugene
 * Output :
 * Sorted Set : Alice Bluto Eugene Harry Olive
 * Array list from Set : Alice Bluto Eugene Harry Olive
 */

import java.util.*;

public class SortedSet {

    public List<String> sortElements(String inputString) {

        /**Return null if input string is empty or inputString is blank*/
        if (inputString.isEmpty() || inputString.isBlank()) {
            return null;
        }

        String[] inputArray = inputString.split(" ");
        List<String> inputArrayList = new ArrayList<>(Arrays.asList(inputArray));
        /**This will create TreeSet object for inputArrayList in which elements will get stored in default natural sorting order.*/
        TreeSet<String> treeSet = new TreeSet<>(inputArrayList);
        /**Convert the sorted set in to an array list*/
        return new ArrayList<>(treeSet);
    }
}
