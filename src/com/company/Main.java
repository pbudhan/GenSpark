
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // set up scanner
        Scanner reader = new Scanner(System.in);
        //console prompt
        System.out.println("You are in a land full of dragons. In front of you, you see two caves. In one cave, the " +
                "dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you" +
                "on sight. Which cave will you go into? (1 or 2) ");
        // Scans the next token of the input as an int.
        int n = reader.nextInt();
        //set up conditional statement for checking the integer value
        if (n == 1){
            System.out.println("You approach the cave... " +
                    "It is dark and spooky..." +
                    "A large dragon jumps in front of you! He opens his jaws...Gobbles you down in one bight!");
        }
        else {
            System.out.println("You approach the cave... " +
                    "It is dark and spooky..." +
                    "A large dragon jumps in front of you! He opens his...hands and offers you some of his treasure");
        }
        // once finished
        reader.close();

    }
}
