package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
//    public void setSalary(int m){
//        salary = m;
//    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int legth;
    int width;

    public int perimeter() {
        return 2*legth*width;
    }

    public int area() {
        return legth*width;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class cwh_39_ch8ps {
    public static void main(String[] args) {
        /*
        // Problem 1
            Employee vansh = new Employee();
            vansh.setName("vansh gajera");
            vansh.salary = 256;
            System.out.println(vansh.getSalary());
            System.out.println(vansh.getName());

        // Problem 2
        Cellphone asus = new Cellphone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();


         Problem 3
         Square sq = new Square();
         sq.side = 3;
         System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 4
        Rectangle rec = new Rectangle();
        rec.width = 4;
        rec.legth = 5;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

         */

        // problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();




    }
}
