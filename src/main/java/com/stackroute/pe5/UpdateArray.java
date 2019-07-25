package com.stackroute.pe5;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to update specific array element by given element and empty the array list.
 * Input: [Apple, Grape, Melon, Berry]
 * Output: [Kiwi, Grape, Mango, Berry]
 * Array list after removing all elements []
 */

public class UpdateArray {
    public ArrayList<String> arrayList;

    public List updateArrayElement(List<String> inputArray, int index, String newElement) {

        /**Throw invalid parameter exception if array size is less than 0 or index is less than 0*/
        if (inputArray.size() <= 0 || index < 0) {
            throw new InvalidParameterException();
        }

        /**Throw index of bound exception if index is greater array size */
        if (index > inputArray.size()) {
            throw new IndexOutOfBoundsException();
        }

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
