package com.stackroute.pe5;
/**
 * Write a Java program to update specific array element by given element and empty the array list.
 * Input: [Apple, Grape, Melon, Berry]
 * Output: [Kiwi, Grape, Mango, Berry]
 * Array list after removing all elements []
 */

import java.util.ArrayList;
import java.util.List;

public class UpdateArray {
    public ArrayList<String> arrayList;

    public List updateArrayElement(List<String> inputArray, int index, String newElement) {

        arrayList = new ArrayList<String>(inputArray);
        arrayList.clear();

        /**replace the old element by new element at given index*/
        inputArray.set(index, newElement);
        return inputArray;
    }

    public List<String> getArrayList() {
        /**Return the empty array list after replacing the new element*/
        return arrayList;
    }
}
