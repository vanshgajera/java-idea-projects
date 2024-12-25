package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

// question 3

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

// Q6
interface TVRemote{
    void powerOn();
    void powerOff();
}

interface SmartTVRemote extends TVRemote {
    void openApp(String appName);
    void browseInternet(String url);
}

class MySmartTVRemote implements SmartTVRemote{
    @Override
    public void openApp(String appName) {
        System.out.println("Opening app: " + appName);
    }
    @Override
    public void browseInternet(String url) {
        System.out.println("Browsing to: " + url);
    }
    @Override
    public void powerOn() {
        System.out.println("TV is now ON.");
    }
    @Override
    public void powerOff() {
        System.out.println("TV is now OFF.");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {
        // Q1 and Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human vns = new Human();
        vns.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        // m1.speak(); --> Cannot use speak method beacuse the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

        // Q6
        MySmartTVRemote remote = new MySmartTVRemote();

        // Using methods from TVRemote
        remote.powerOn();

        // Using methods from SmartTVRemote
        remote.openApp("Netflix");
        remote.browseInternet("www.example.com");

        remote.powerOff();

    }
}
