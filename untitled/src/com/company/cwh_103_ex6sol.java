package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cant be greater than 100000";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
        return "Input cant be greater than 7000 while multiplying";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException , MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 || a==9){
             throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException,MaxInputException,MaxMultiplyInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        } else if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class cwh_103_ex6sol {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException,MaxInputException , MaxMultiplyInputException {

        CustomCalculator c = new CustomCalculator();
//        c.add(8,9);
           // c.divide(6,0);
           // c.divide(700000,7000);
            c.divide(70,7001);

    }
}
