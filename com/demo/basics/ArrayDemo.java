package com.demo.basics;

public class ArrayDemo {


    String name= "test";

    public void printName(){
        System.out.println(name);
    };

    public static void main(String[] args){
        // 3 different ways to create array;
        // Array fixed size with same data type elements

        //1
        int[] scores = new int[4];
        scores[0]= 90;
        scores[1]= 80;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]); // default value for the type (0)
        System.out.println(scores[3]);

        //2
        int scores2[] = new int[1];
        System.out.println(scores2[0]);

        //3
        int[] scores3 = new int[]{90,80,70};
        System.out.println(scores3[2]);

        //4
        int[] scores4 = {90,80,40,50};
        System.out.println((scores4[2]));

        int[] rand= new int[50];
        for(int i =0; i<50; i++){
            rand[i] = i;
        }
        System.out.println(rand);

        ArrayDemo[] ar = new ArrayDemo[]{new ArrayDemo(),new ArrayDemo()};
        ar[0].printName();


        // 2d arrat
        int[][] array2d = new int[2][2];
        int[][] array2d1 = new int[][]{{1,3},{1,4},{2,4},{3,5}};
        int[][] array2d2 = {{1,3},{1,4},{2,4},{3,5}};
        System.out.println(array2d1[1][1]);

        int[][] irrArray = new int[2][];
    }
}
