package com.company;

import java.util.Scanner;

public class cwh_86_ps14 {
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_bond = 2000-48; // Logical error
        // System.out.println(6/0);

        // Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 5;
        marks[2] = 7;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }

    }
}
