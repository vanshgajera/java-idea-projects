package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

class Circle{
    private int radius;
    private float area;
    private float perimeter;

    public void setRadius(int r){
        radius = r;
    }
    public void checkarea(float a){
        area = 3.14f * radius * radius;
        if(area==a){
            System.out.println("Correct Area.");
        }
        else{
            System.out.println("Incorrect Area.");
        }
    }
    public void checkperimeter(float p){
        perimeter = 2*3.14f*radius;
        if(perimeter==p)
        {
            System.out.println("Correct Perimeter.");
        }
        else{
            System.out.println("Incorrect Perimeter.");
        }
    }
}

public class cwh_40_ch9 {
    public static void main(String[] args) {
        /*
        MyEmployee vansh = new MyEmployee();
        // vansh.id = 45;
        // vansh.name = "vansh gajera m.";

        vansh.setName("vansh gajera");
        System.out.println(vansh.getName());
        vansh.setId(124);
        System.out.println(vansh.getId());

         */

        // problem solve
        Circle ci= new Circle();
        ci.setRadius(3);
        ci.checkarea(28.26f);
        ci.checkperimeter(18.84f);

    }
}
