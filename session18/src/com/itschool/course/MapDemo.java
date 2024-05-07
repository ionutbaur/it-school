package com.itschool.course;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        mapMethod();
    }

    private static void mapMethod() {
        Map<Long, String> personMap = new TreeMap<>(Comparator.reverseOrder());
        personMap.put(191777777L, "Ionutz Gabriel");
        personMap.put(293746546L, "Andreea");
        personMap.put(197345454L, "Ionutz Gabriel");
        personMap.put(532476362L, "Vasilica");

        long mihaiCnp = 1935664676464L;
        personMap.put(mihaiCnp, "Stoian Mihai");

        personMap.put(532476362L, "Andrei");

        String myValue = personMap.get(mihaiCnp);
        //System.out.println(myValue);

        Map<String, Long> map = new HashMap<>();
        map.put("Ionutz", 12345L);

        for (Map.Entry<Long, String> entry : personMap.entrySet()) {
            long key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }

        /*for (Long key : personMap.keySet()) {
            System.out.println(key);
            boolean isFound = false;
            // logic
            if (isFound) {
                String name = personMap.get(key);
            }
        }*/
    }
}
