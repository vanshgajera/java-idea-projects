package com.company;

class EkClass{
    int a;

    public int getA(){
        return a;
    }

    public EkClass(int a) {
        this.a = a;
    }

    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai constructor hoon");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(55);
        DoClass d = new DoClass(5);
       // System.out.println(e.getA());
    }
}
