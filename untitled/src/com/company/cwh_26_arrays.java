package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        /* Classroom  of 500 student - You have to store marks of these 500 student
        You have 2 options:
        1. Create 500 variable
        2.Use Arrays (recommended)
         */
        // Threr are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int [5];

        // 2. Declaration and then memory allocation
//        int [] marks ;
//        marks = new int [5];
        // Initialization
//        marks [0] = 100;
//        marks [1] = 90;
//        marks [2] = 80;
//        marks [3] = 70;
//        marks [4] = 60;
//        marks [5] = 76; - throws an error

        // 3. Declaration,  memory allocation and initialization together
        int[] marks = {20,30,50,60,40};
        System.out.println(marks[4]);

    }
}
