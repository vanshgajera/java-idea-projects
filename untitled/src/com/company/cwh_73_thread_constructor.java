package com.company;


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}

class MyThhr implements  Runnable{
    public void run(){
        int i = 80;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }

}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {
      MyThr t1 = new MyThr("vansh");
//       MyThr t2 = new MyThr("harry");
//        t1.start();
//        t2.start();
//        System.out.println("The id of the thread t is " + t1.getId());
//        System.out.println("The id of the thread t is " + t1.getName());
//        System.out.println("The id of the thread t is " + t2.getId());
//        System.out.println("The id of the thread t is " + t2.getName());

        MyThhr myThr1 = new MyThhr();
        MyThhr myThr2 = new MyThhr();

        Thread t3 = new Thread(myThr1, "axit");
        Thread t4 = new Thread(myThr2, "mohan");

        t3.start();
        t4.start();
        System.out.println("The id of the thread t is " + t3.getId());
        System.out.println("The id of the thread t is " + t3.getName());
        System.out.println("The id of the thread t is " + t4.getId());
        System.out.println("The id of the thread t is " + t4.getName());

    }
}
