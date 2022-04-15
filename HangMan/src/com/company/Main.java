package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1 or 2 players?");
        String players = keyboard.nextLine();
        String word;

        if (players.equals("1")) {
            // list to hold words
            List<String> words = new ArrayList<>();
            //get a random word from the ArrayList
            words = getWords();
            Random rand = new Random();
            word = words.get(rand.nextInt(words.size()));
        }
        //a two player mode?
        else {
            //word is entered and player 2 has to guess
            System.out.println("Player 1, please enter your word:");
            word = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Ready for player 2! Good luck!");
        }

        // store and track player guesses
        List<Character> playerGuesses = new ArrayList<>();
        Integer wrongCount = 0;

        //print current state, get their guess, and allow them to guess
        while(true) {
            printHangedMan(wrongCount);
            if (wrongCount >= 6) {
                System.out.println("You lose!");
                System.out.println("The word was: " + word);
                break;
            }
            printWordState(word, playerGuesses);
            if (!getPlayerGuess(keyboard, word, playerGuesses)) {
                wrongCount++;
            }

            if(printWordState(word, playerGuesses)) {
                System.out.println("You win!");
                break;
            }
            System.out.println("Please enter your guess for the word:");
            //if player guesses word correctly
            if(keyboard.nextLine().equals(word)) {
                System.out.println("You win!");
                break;
            }
            //if player word guess is incorrect
            else {
                System.out.println("Nope! Try again.");
            }
        }
    }

    private static ArrayList<String> getWords(){
        ArrayList<String> wordBank = new ArrayList<>();
        //add 10 words to word bank
       /* wordBank.add("RING");
        wordBank.add("HEAD");
        wordBank.add("BAND");
        wordBank.add("FIRE");
        wordBank.add("ROAD");
        wordBank.add("TIME");
        wordBank.add("LIFE");
        wordBank.add("GOOD");
        wordBank.add("SING");*/
        wordBank.add("FACE");
        return wordBank;
    }
    private static void printHangedMan(Integer wrongCount) {
        System.out.println(" +-----+");
        System.out.println(" |     |");
        if (wrongCount >= 1) {
            System.out.println(" O");
        }

        if (wrongCount >= 2) {
            System.out.print("\\ ");
            if (wrongCount >= 3) {
                System.out.println("/");
            }
            else {
                System.out.println("");
            }
        }

        if (wrongCount >= 4) {
            System.out.println(" |");
        }

        if (wrongCount >= 5) {
            System.out.print("/ ");
            if (wrongCount >= 6) {
                System.out.println("\\");
            }
            else {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    //getting guess from user
    //include way to keep track of past guesses so they can't do it again
    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter:");
        String letterGuess = keyboard.nextLine();
        //add first char guess to list of characters
        playerGuesses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);
    }
    //helper function to check player guess and display remaining blanks
    private static boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else {
                System.out.print("-");
            }
        }
        System.out.println();
        return (word.length() == correctCount);
    }
}
