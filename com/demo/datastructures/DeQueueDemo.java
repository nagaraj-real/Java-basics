package com.demo.datastructures;


import java.util.ArrayDeque;
import java.util.Deque;

// FIFO
// no index access
// useful when manipulating head or tail
// tail ~ add
// head ~ remove
// Deque -> Double ended Queue -> Models both FIFO & LIFO. Used for Stack
// Deque implementations -> ArrayDeque, LinkedList
// Prefer Array Deque ove LinkedList
public class DeQueueDemo {

    public static void main(String[] args){
        fifoDemo();
        lifoDemo();
    }

    private static void fifoDemo(){
        Deque<String> deque = new ArrayDeque();
        deque.add("walden");
        deque.add("harry");
        deque.add("hagrid");
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);

    }

    private static void lifoDemo(){
        Deque<String> deque = new ArrayDeque();
//        deque.push("walden");
//        deque.push("harry");
//        deque.push("hagrid");
        deque.offerLast("walden");
        deque.offerLast("harry");
        deque.offerLast("hagrid");
        System.out.println(deque);
//        System.out.println(deque.pop());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}
