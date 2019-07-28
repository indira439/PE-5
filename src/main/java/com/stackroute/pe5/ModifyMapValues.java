package com.stackroute.pe5;
/**
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 * Modify and return the given map as follows:
 * a. If the key `val1` has a value, set the key `val2` to have that value, and
 * b. Set the key `val1` to have the value `" "` (empty string).
 * Example 1:
 * The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
 * "java"}
 * Example 2:
 * The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
 * "mars"}
 */

import java.util.HashMap;
import java.util.Map;

public class ModifyMapValues {

    public Map<String, String> getModifiedMapValues(Map<String, String> inputMap) {

        Map<String, String> map = new HashMap<String, String>();

        /**If the key `val1` has a value, set the key `val2` to have that value,
         * and Set the key `val1` to have the value `" "` (empty string)*/
        if (inputMap.containsKey("val1")) {
                String value2 = inputMap.get("val1");
                map.put("val1", " ");
                map.put("val2", value2);
            }
        else {
            return null;
        }
        return map;
    }
}
