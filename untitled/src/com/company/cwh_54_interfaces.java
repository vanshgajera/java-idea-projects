package com.company;

interface Bicycle{
    int a = 46;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println();
    }

    public void applyBrake(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi kushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
         AvonCycle cycleVansh = new AvonCycle();
         cycleVansh.applyBrake(1);
         // You can create properties in interface
        System.out.println(cycleVansh.a);

        // You cannot modify the properties in Interfaces as they are final
        // cycleVansh.a = 465;
        // System.out.println(cycleVansh.a);

        cycleVansh.blowHornK3g();
        cycleVansh.blowHornmhn();
   }
}
