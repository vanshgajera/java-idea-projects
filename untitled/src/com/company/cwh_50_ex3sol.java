package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1{
    public int number;
    public  int inputNumber;
    public int noOfGuesses = 0;
    
    public int getNoOfGuesses(){
        return noOfGuesses;
    };
     public void setNoOfGuesses(){
         this.noOfGuesses = noOfGuesses;
     }

     // constructor
     Game1(){
         Random rend = new Random();
         this.number = rend.nextInt(100);
    }

    void taskUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
         noOfGuesses++;
          if(inputNumber == number){
              System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempt",number, noOfGuesses);
              return true;
          }
          else if(inputNumber < number){
              System.out.println("Too low...");
          }
          else {
              System.out.println("Too high...");
          }
          return false;
    }



}

public class cwh_50_ex3sol {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play  "Guess the number"
            game once. Game should have the following methods:
            1. Contractor to generate the random number
            2. takeUserInput() to tack a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this tack done!
         */

        Game1 g = new Game1();
        boolean b = false;
        while (!b){
            g.taskUserInput();
            b = g.isCorrectNumber();
        }

    }
}
