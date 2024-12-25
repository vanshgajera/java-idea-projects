package com.company;

public class cwh_35_practice_set {
    static void multiplication(int a){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",a,i,a*i);
        }
    }

    static void patten1(int n){
        for (int i=0;i<n;i++){
            for(int j=0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //  sum(n) = 1 + 2 + 3 ... + n
    //  sum(n) = 1 + 2 + 3 ... + n-1 + n
    //  sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n){
        //Base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }


    static void patten2(int n){
        for (int i=0;i<n;i++){
            for(int j=n; j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        // if (n==1 || n==2){
        //   return n - 1;
        // }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    static int calculateAverage(int ...arr){
        //Available as int [] arr;
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return  result / arr.length;
    }

    // patten solution 7
    static void pattern2_rec1(int n, int i) {
        if (i >= n) {
            return;
        }
        for (int j = n; j > i; j--) {
            System.out.print("*");
        }
        System.out.println();
        pattern2_rec1(n, i + 1);
    }

    // patten solution 7
    static void pattern2_rec(int rows) {
        if(rows > 0) {
            for(int i=rows; i>0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(rows-1);
        }
    }


    static void pattern1_rec(int n){
        if(n > 0){
            pattern1_rec(n - 1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1_rec(3)
    //pattern1_rec(2) + 3 time star and new line.
    //pattern1_rec(1) + 2 time star and new line + 3 time star and new line.
    //pattern1_rec(0)  + 1 time star and new line + 2 time star and new line + 3 time star and new line.

    // solution 9
    static float fahrenheit(float cel) {
        float fahren = (cel * (9/5.0f)) + 32.0f;
        return fahren;
    }

    // Question 10 =>
    static int nSum(int n) {
        int sum = 0;
        for(int i=1; i<n+1; i++) {
            sum += i;
        }
        return sum;
    }















    public static void main(String[] args) {
        // Problem 1
        // multiplication(18);

        // Problem 2
       // patten1(5);

        // Problem 3
        // int c = sumRec(4);
        // System.out.println(c);

        //Problem 4
       // patten2(5);

       // Problem 5
       // fibonacci series - 0 , 1, 1, 2, 3, 5, 8, 13, 21, 34
        // int result = fib(5);
        // System.out.println(result);

        // Problem 6
        // int average = calculateAverage(10,20,30,40,50);
        // System.out.println(average);

        // Problem 7
        // pattern2_rec(4);

        // Problem 8
       // pattern1_rec(3);

        // Problem 9
        // float celcius = 1.0f;
        // System.out.println(celcius + " °C" + " -> " + fahrenheit(celcius) + " °F");

        // Problem 10
        int num = 5;
        System.out.println("The sum of first " + num + "th natural numbers is: " + nSum(num));

    }
}
