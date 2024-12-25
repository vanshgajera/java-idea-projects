package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-here";
    }

    // contractors
    public MyMainEmployee(String myName,int myId){
        id = myId;
        name = myName;
    }

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

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee vansh = new MyMainEmployee("Vansh_gajera_M",16);
        // MyMainEmployee vansh = new MyMainEmployee();

        // vansh.setId(34);
        // vansh.setName("vansh gajera");
        System.out.println(vansh.getId());
        System.out.println(vansh.getName());
    }
}
