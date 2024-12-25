package com.company;

import java.util.Scanner;

public class CWH_12_ps2_pr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the value a =");
//        int a = sc.nextInt();
//        System.out.println(a>15);
//        System.out.println(7*49/7 + 35/7);

        System.out.println("Enter the value v =");
        float v = sc.nextFloat();
        System.out.println("Enter the value u =");
        float u = sc.nextFloat();
        System.out.println("Enter the value s =");
        float s = sc.nextFloat();
        System.out.println("Enter the value b =");
        float b = sc.nextFloat();

        float ans = (v*v-u*u)/(2*b*s);

        System.out.println("ans = "+ ans);


    }
}
