package com.demo.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListIteratorDemo {

    public static void main(String[] args){
        removeUsingListIterator();
        addUsingListIterator();
        setUsingListIterator();
    }

    private static void removeUsingListIterator(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(123);
        for(ListIterator<Integer> iter = list.listIterator(); iter.hasNext();){
            System.out.println(iter.next());
            iter.remove();
        }
        System.out.println(list); // empty

    }

    private static void addUsingListIterator(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(123);
        for(ListIterator<Integer> iter = list.listIterator(); iter.hasNext();iter.next()){
            if(iter.hasPrevious()){
                System.out.println(iter.previous());
                iter.next();
            }
            iter.add(10);
        }
        System.out.println(list); // will add 10 in between each

    }

    private static void setUsingListIterator(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(123);
        for(ListIterator<Integer> iter = list.listIterator(); iter.hasNext();){
            System.out.println(iter.next());
            iter.set(10);
        }
        System.out.println(list); // update 10 in each

    }





}
