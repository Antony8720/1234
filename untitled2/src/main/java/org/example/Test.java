package org.example;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

    }

    public Map<String,Object> convertMap (Map<String,Object> map) {

        HashMap newMap = new HashMap<String,Object>();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Map<?,?>) {
                convertMap(entry.getValue())
            }



        }
    }
}
