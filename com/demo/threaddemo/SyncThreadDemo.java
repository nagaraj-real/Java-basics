package com.demo.threaddemo;
import java.util.ArrayList;

class Task1 implements Runnable{

    private ArrayList al;
    Task1(ArrayList _al){
        al = _al;
    }
    @Override
    public void run()  {
        synchronized (al){
            try {
                al.add(50);
                Thread.sleep(1000);
                System.out.println("thread 1" + this.al);
            }catch (Exception ex){

            }
        }
    }
}

class Task2 implements Runnable{

    private ArrayList al;
    Task2(ArrayList _al){
        al = _al;
    }
    @Override
    public void run() {
        al.remove(0);
        System.out.println("thread 2" + al);
    }
}

public class SyncThreadDemo {

    public static void main(String[] args) throws InterruptedException{
        // Both threads accessing same object
        ArrayList al = new ArrayList();
        al.add(1); al.add(2);
        Runnable r = new Task1(al);
        Thread t = new Thread(r);
        t.start();
        // Join will wait for the previous thread to finish
//        t.join();
        Runnable r2 = new Task2(al);
        Thread t2 = new Thread(r2);
        t2.start();
        System.out.println(al);
    }
}
