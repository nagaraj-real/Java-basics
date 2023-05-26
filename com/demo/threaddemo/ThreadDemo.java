package com.demo.threaddemo;

class MyTask implements Runnable{
    void executeTask(){
        for (int doc=0;doc<=10;doc++){
            System.out.println("@@ Printing Document #"+ doc);
        }
    }

    @Override
    public void run() {
        executeTask();
    }
}

class MyTask2 implements Runnable{
    void executeTask(){
        for (int doc=0;doc<=10;doc++){
            System.out.println("@@ Printing Document 2nd task **"+ doc);
        }
    }

    @Override
    public void run() {
        executeTask();
    }
}


public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("==Application Started==");
        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();
        //task.join();  -- makes sure it's in sequence
        Thread task2 = new Thread(new MyTask2());
        task2.start();
        for (long doc=0;doc<10;doc++){
            System.out.println(doc);
        }

        //Task task = new MyTask();
        //task.executeTask();



        System.out.println("==Application ended==");
    }
}
