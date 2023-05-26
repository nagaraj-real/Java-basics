package com.demo.datastructures;

import java.util.*;

// Unique and
// 1. can be sorted if tree set
// 2. maintains insert order if linked hashset
public class HashSetDemo {

    public static void main(String[] args){
        HashSetAdd();
        HashSetAddBook();
        LinkedHashSetAdd();
        TreeSet();
        TreeSetAddBook();
        TreeNavigateSet();
    }

    private static void HashSetAdd(){
        Set<String> set1 = new HashSet<>();
        set1.add("raj");
        set1.add("raghav");
        set1.add("anitha");
        set1.add("raj"); // no duplicates allowed
        System.out.println(set1);
    }

    // insert order preserved
    private static void LinkedHashSetAdd(){
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("raj");
        set1.add("raghav");
        set1.add("anitha");
        set1.add("raj"); // no duplicates allowed
        System.out.println(set1);


    }

    // Sorted and unique
    private static void TreeSet(){
        Set<String> set1 = new TreeSet<>();
        set1.add("raj");
        set1.add("raghav");
        set1.add("anitha");
        set1.add("raj"); // no duplicates allowed
        System.out.println(set1);
    }


    private static void TreeNavigateSet(){
        NavigableSet<Integer> set1 = new TreeSet<>();
        set1.add(74);
        set1.add(23);
        set1.add(5);
        set1.add(89); // no duplicates allowed
        System.out.println(set1);
        System.out.println("lower: "+ set1.lower(74));
        System.out.println("floor: "+ set1.floor(74));
        System.out.println("ceiling: "+ set1.ceiling(74));
        System.out.println("higher: "+ set1.higher(74));

        System.out.println("first: "+ set1.first());
        System.out.println("last: "+ set1.last());

        NavigableSet<Integer> descendingSet = set1.descendingSet();
        System.out.println("descending set: "+ descendingSet);

        NavigableSet<Integer> headset = set1.headSet(70,false);
        System.out.println("headset set: "+ headset);

        headset.add(6);
        headset.add(5);
        System.out.println("headset set: "+ headset);
        //headset.add(75); -> key out of range since > 74

        SortedSet<Integer> subset = set1.subSet(3,80);
        System.out.println("subset: "+ subset);
        //subset.add(2); ->key out of range < 3
    }

    private static void TreeSetAddBook(){
        // this will override
        // Strategy pattern. selected at run time
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.year >= o2.year ? -1: 1;
            }
        };
        Set<Book> set1 = new TreeSet<>(comparator);
        set1.add(new Book("test","raj",2018));
        set1.add(new Book("test2","raj2",2019));
        set1.add(new Book("test3","raj3",2020));
        set1.add(new Book("test3","raj3",2020)); // not added due to different hashcode methods        System.out.println(set1);
        System.out.println(set1);
    }



    private static void HashSetAddBook(){
        Set<Book> set1 = new HashSet<>();
        set1.add(new Book("test","raj",2018));
        set1.add(new Book("test2","raj2",2019));
        set1.add(new Book("test3","raj3",2020));
        set1.add(new Book("test3","raj3",2020)); // not added due to different hashcode methods        System.out.println(set1);
        System.out.println(set1);
    }

    static class Book implements Comparable<Book>{
        private String title;
        private String author;
        private int year;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Book(String title, String author, int year) {
            super();
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
        }

        // to make sure duplicates are not added
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((author == null) ? 0 : author.hashCode());
            result = prime * result + ((title == null) ? 0 : title.hashCode());
            result = prime * result + year;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Book other = (Book) obj;
            if (author == null) {
                if (other.author != null)
                    return false;
            } else if (!author.equals(other.author))
                return false;
            if (title == null) {
                if (other.title != null)
                    return false;
            } else if (!title.equals(other.title))
                return false;
            if (year != other.year)
                return false;
            return true;
        }

        // if return 0 -> not added and assumed as duplicate
        @Override
        public int compareTo(Book o) {
            return o.year > year ? -1: 1;
        }

	/*public int hashCode() {
		return title.hashCode();
	}

	public boolean equals(Object o) {
		return (year == (((Book)o).getYear())) && (author.equals((((Book)o).getAuthor())));
	}*/

    }
}
