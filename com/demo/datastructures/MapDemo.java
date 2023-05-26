package com.demo.datastructures;

import java.util.*;

// Fast lookup
public class MapDemo {

    public static void main(String[] args){
        mapDemo();
        lruCacheTest();
        treeMapDemo();
    }

    private static void mapDemo(){
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1,"Jack");
        myMap.put(2,"John");
        myMap.put(3,"Mary");
        System.out.println(myMap);
        System.out.println(myMap.containsKey(2));
        System.out.println(myMap.get(2));

        Set<Integer> names = myMap.keySet();
        for(Integer name: names){
            System.out.println("Name:"+ name+ "Value:"+ myMap.get(name));
        }

        Set<Map.Entry<Integer,String>> keynames = myMap.entrySet();
        for(Map.Entry<Integer,String> name: keynames){
            System.out.println("Name:"+ name.getKey() + "Value:"+ name.getValue());
        }
    }

     /* Demo:
            * 	1. See output with and without commenting get() calls
	   *    2. See output when accessOrder=false with get() calls. get calls do not have any influence
	   *    3. Finally, change object type from LRUCache to LinkedHashMap and see output.
            *       All 5 mappings will be printed as removeEldestEntry would return false by default
	   */
    private static void lruCacheTest() {
        System.out.println("\n\nInside lruCacheTest ...");
        boolean isLruCache = false; // will move the most recently used to end
        Map<String, String> lruCache = new LinkedHashMap<>(16, 0.75f, isLruCache);
        lruCache.put("a", "A");
        lruCache.put("b", "B");
        lruCache.put("c", "C");
        System.out.println(lruCache);

        lruCache.get("a"); // multiple gets to "a" will not make a difference
        lruCache.get("a");
        lruCache.get("a");
        System.out.println(lruCache);
        lruCache.get("b");
        System.out.println(lruCache);

        lruCache.put("d", "D");
        System.out.println(lruCache);
        lruCache.put("e", "E");
        System.out.println(lruCache);
    }

    private static void treeMapDemo() {
        System.out.println("\n\nInside treeMapDemo ...");
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("John", 25);
        map1.put("Raj", 29);
        map1.put("Anita", 23);

        System.out.println(map1);

        System.out.println("Iterating using entrySet ...");
        Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
        for (Map.Entry<String, Integer> mapping : mappings) {
            System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
            if (mapping.getKey().equals("John"))
                mapping.setValue(26);
        }
        System.out.println(map1);
//        map1.floorEntry("Raj").setValue(22);
    }

}
