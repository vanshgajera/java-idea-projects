package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark in english =");
        float a = sc.nextFloat();

        System.out.print("Enter the mark in maths =");
        float b = sc.nextFloat();

        System.out.print("Enter the mark in science =");
        float c = sc.nextFloat();

        float sum = a + b + c;
//        System.out.println(sum);

        float pers = sum * 100 / 300 ;
        System.out.println(pers);
    }
}
