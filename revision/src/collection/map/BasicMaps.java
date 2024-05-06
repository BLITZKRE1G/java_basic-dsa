package collection.map;

import java.util.*;

public class BasicMaps {

    public static void main(String[] args) {

        /* Hash Map */
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 11);
        hashMap.put("D", 5);
        hashMap.put("E", 9);
        System.out.println("Hash Map:" + hashMap);
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.computeIfPresent("A",  (str, value) -> {
            System.out.printf("%s is present in the Map. Value of %s: %d", str, str, value);
            return value;
        }));
        System.out.println(hashMap.computeIfAbsent("Z", (str) -> {
            System.out.printf("Key: %s not present in the Map", str);
            return 0;
        }));
        System.out.println(hashMap.getOrDefault(String.valueOf(9), -1));

        /* Tree Map */
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("B", 100);
        treeMap.put("D", 9);
        treeMap.put("C", 2);
        System.out.println(treeMap);
    }
}
