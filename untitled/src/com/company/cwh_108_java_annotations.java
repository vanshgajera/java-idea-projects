package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    @Deprecated
    public int sum(int a , int b){
        return a+b;
    }
}

public class cwh_108_java_annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprection")
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5,6);

    }
}
