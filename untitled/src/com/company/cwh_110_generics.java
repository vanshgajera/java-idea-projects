package com.company;

import java.util.ArrayList;

public class cwh_110_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);

        int a =  arrayList.get(2);
        System.out.println(a);

    }
}
