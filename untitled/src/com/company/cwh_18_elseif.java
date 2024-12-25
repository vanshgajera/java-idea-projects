package com.company;

import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {

        int age;
        System.out.print("Enter Your Age :-");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retried!");
                break;
            default:
                System.out.println("Enjoy the life!");
        }


    /*
        if(age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi-experienced");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println(" You are not experienced ");
        }

     */



    }
}
