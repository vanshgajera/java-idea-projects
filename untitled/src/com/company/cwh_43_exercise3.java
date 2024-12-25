package com.company;

import java.util.Random;
import java.util.Scanner;



class Game{
    private int randomNumber;
    private int noOfGuesses;

    // Contractor
    public Game(){
        Random random = new Random();
        this.randomNumber  = random.nextInt(100) ; // Random number between to 1 and 100
        noOfGuesses = 0;
    }


    public int takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number (1-100): ");
        return scanner.nextInt();
    }

    // Method to check if the user's guess is correct
    public boolean isCorrectNumber(int userInput) {
        noOfGuesses++;
        if (userInput == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number in " + noOfGuesses + " guesses.");
            return true;
        } else if (userInput < randomNumber) {
            System.out.println("The number is higher than " + userInput);
        } else {
            System.out.println("The number is lower than " + userInput);
        }
        return false;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
}

public class cwh_43_exercise3 {
    public static void main(String[] args) {


        Game game = new Game();
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            int userInput = game.takeUserInput();
            hasGuessedCorrectly = game.isCorrectNumber(userInput);
        }

    }
}

  /*
            Create a class Game, which allows a user to play  "Guess the number"
            game once. Game should have the following methods:
            1. Contractor to generate the random number
            2. takeUserInput() to tack a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this tack done!
         */
