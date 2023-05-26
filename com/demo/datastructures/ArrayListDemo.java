package com.demo.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args){
       // Collection<Integer> list1 = new ArrayList<>();
        var demo = new ArrayListDemo();
        List<Integer> list1 = new ArrayList<>();

        demo.basicCollectionMethods(list1);

        //List specific methods
        demo.positionListMethods(list1);
        demo.bulkListMethods(list1);
        demo.searchListMethods();
        demo.rangeListMethods();
        demo.printList();

    }

    public void basicCollectionMethods(Collection<Integer> list1){
        
        // Common collection methods
        list1.add(1);
        list1.add(123);
        list1.add(1); // duplicate
        list1.add(null); // null
        System.out.println(list1);

        list1.remove(2); // 2 overloads -> index and object
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1); // object is removed not index when collection reference is used.
    }

    public void positionListMethods(List<Integer> list1){
        list1.add(1,10);
        System.out.println(list1);
        list1.set(1,9);
        System.out.println(list1);
    }

    public void bulkListMethods(List<Integer> list1){
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

    public void searchListMethods(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        list.add(2);
        System.out.println(list.contains(123)); // true
        System.out.println(list.indexOf(123)); // 1 or -1 if not found
        System.out.println(list.lastIndexOf(123));
    }

    public void rangeListMethods(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        list.add(2);
        list.add(500);
        System.out.println(list.subList(1,3)); // (1,3-1)
        var list3 = list.subList(1,3);
        list3.set(1,1234);
        System.out.println(list3); // 123,1234
        System.out.println(list); // 1,123,2,500
        list.set(1,20);
        // list.add(1000); // this will throw error -> concurrent modification (only set allowed)
        // list.remove(0); // same
        System.out.println(list3); // 20, 1234
    }

    public void printList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        list.add(2);
        list.add(500);
        for(int i : list){
            System.out.print(i);
            //list.remove(i); // concurrent modification error
            // to remove item in list use iterator.
        }
        list.forEach(System.out ::println); // method reference
        list.forEach((value)-> System.out.print(value)); // lambda
    }

}
