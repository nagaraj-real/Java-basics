package com.demo.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

// Used for frequent add/remove
//O(n/2) -> get(i), add(i), remove(i) // traversing based on index
// For get method -> array list os better
public class LinkedListDemo {
    public static void main(String[] args){
        List<Integer> list1 = new LinkedList<>();
        basicCollectionMethods(list1);
        positionListMethods(list1);
        bulkListMethods(list1);
    }

    private static void basicCollectionMethods(Collection<Integer> list1){

        // Common collection methods
        list1.add(1);
        list1.add(123);
        list1.add(2);
        list1.add(null); // null
        System.out.println(list1);

        list1.remove(2); // 2 overloads -> index and object
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1); // object is removed not index when collection reference is used.
    }

    private static void positionListMethods(List<Integer> list1){
        list1.add(1,10);
        System.out.println(list1);
        list1.set(1,9);
        System.out.println(list1);
    }

    private static void bulkListMethods(List<Integer> list1){
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(3);

        list1.removeAll(list2);
        System.out.println(list1);
        list1.add(1,9);
        list1.retainAll(list2);
        System.out.println(list1);
        //list1.add(2,100); //list.set(2,100) array index bound error
        System.out.println("set "+ list1.set(0,100)); // previous value is returned
        System.out.println(list1);
    }

}
