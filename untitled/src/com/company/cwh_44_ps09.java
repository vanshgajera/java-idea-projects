package com.company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Problem 2
    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}

class Sphere{
    private  int r;

    public Sphere(int r) {
        this.r = r;
    }

    public Sphere() {
        this.r = 3;
    }

    public double Sphere1(){
        return 4 * Math.PI * r * r;
    }
}

public class cwh_44_ps09 {
    public static void main(String[] args) {


        // Problem 1
        Cylinder myCylinder = new Cylinder(12,9);
        // myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        // myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());



        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        // Problem 3
        Rectangle1 r = new Rectangle1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        // Problem 4
        Sphere sp = new Sphere(2);
        System.out.println(sp.Sphere1());



    }
}
