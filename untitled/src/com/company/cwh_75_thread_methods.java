package com.company;

class MyNewThr1 extends Thread{

    public void run(){
        int i = 0;
        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you" +  this.getName());
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        while(true){
//            System.out.println("I am a thread");
            System.out.println(" My Thank you" +  this.getName());
        }
    }
}

public class cwh_75_thread_methods {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
