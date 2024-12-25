package com.company;

public class cwh_32_method_overloading {
    static  void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }

    static void foo(int a , int b){
        System.out.println("Good Morning " + a +" bro!");
        System.out.println("Good Morning " + b +" bro!");
    }

    static void foo(int a , int b , int c){
        System.out.println("Good Morning " + a +" bro!");
        System.out.println("Good Morning " + b +" bro!");
    }

    static  void change(int a){
        a = 98;
    }

    static void change2(int []arr){
        arr[0] = 98;
    }

    static  void tellJoke(){
        System.out.println("I inverted a new word!\n" +
                "plagiarism!");
    }

    public static void main(String[] args) {
        // tellJoke();

      //  Case 1: Changing the Integer
      //  int x = 45;
      //  change(x);
       // System.out.println("The value of x after running change is :" + x);

       //  Case 2 : Changing the Array // array to object to convert and value to send to now.
         int []marks = {52,73,77,89, 98 ,94};
         change2(marks);
        System.out.println("The value of x after running change is :" + marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);;
        // Argument are actual!
    }
}
