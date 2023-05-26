package com.demo.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IteratorDemo {

    public static void main(String[] args){
        removeUsingIterator();
        loopStudent();
    }

    private static void removeUsingIterator(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(123);
        var iter = list.iterator();
        while (iter.hasNext()){
            int elem = iter.next();
            if(elem == 23){
                iter.remove();
                iter.forEachRemaining(System.out::println);
            }
            System.out.println(elem);
        }
    }


    private static StudentList loopStudent(){
        var s = new Student();
        s.setName("Nagaraj");
        s.setAddress("myaddress");
        var d = new Student();
        d.setName("raj");
        d.setAddress("myaddress2");
        StudentList studentList = new StudentList();
        studentList.add(s);
        studentList.add(d);
//        for(Student std: studentList){
//            System.out.println(std.getName());
//        }
        studentList.forEach(new NameConsumer());

        return studentList;
    }

    private static class Student{
        private String name = "default";
        private String address = "defaultAddress";

        public String getName() {
            return name;
        }

        public void setName(String name) {
             this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    private static class StudentList implements Iterable<Student>{
        ArrayList<Student> students = new ArrayList<>();
        @Override
        public Iterator iterator() {
            return new ArrayList<Student>(students).iterator();
        }
        void add(Student std){
            students.add(std);
        }
    }

    private static class NameFilter implements Predicate<Student> {
        @Override
        public boolean test(Student student) {
            return  student.name == "Nagaraj";
        }
    }

    private static class NameConsumer implements Consumer<Student> {
        @Override
        public void accept(Student student) {
            System.out.println(student.getName());
        }
    }


}
