package com.company;

public class cwh_25_practice_set_5 {
    public static void main(String[] args) {
        // Practice Problem 1
//        int n = 4;
//        for(int i=n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        // practice Problem 2
//        int sum = 0;
//        int n= 4;
//        for(int i=0; i<n; i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even number is :- ");
//        System.out.print(sum);
//        // First 4 even number are = 0 2 4 6


        // practice Problem 3
//        int n = 5;
//        for(int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n", n,i, n*i);
//        }

        // practice Problem 4
//        int n = 10;
//        for(int i=10; i>=1; i--){
//            System.out.format("%d X %d = %d\n", n,i, n*i);
//        }

        // practice Problem 5

//        int n = 5;
//        int factorial = 1;
//        for(int i=1;i<=n; i++){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);


        // practice Problem 6
//        int i = 1;
//        int n = 5;
//        int factorial = 1;
//        while(i<=n){
//            factorial = factorial * i;
//            i++;
//        }
//        System.out.println(factorial);


        // practice Problem 7
//        int n= 4;
//        int i=n;
//        while(i>0){
//            int j=0;
//            while (j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }



        //Practice Problem 9

//        int n = 8;
//        int sum = 0;
//        for(int i=1; i<=10; i++){
//            sum += n*i;
//        }
//        System.out.println(sum);


        //Practice Problem 11

        int i = 0;
        int sum = 0;
        int n=4;

        while(i<n){
            sum = sum + (2*i);
            i++;
        }
        System.out.print("Sum of even number is = ");
        System.out.println(sum);

    }
}
