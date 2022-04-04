package company;
import java.lang.String;
import java.util.Scanner;



public class Main {

    public static void guessTheNumber(){
        // write your code here
        Integer tries = 6;
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(20
                * Math.random());
        boolean higher = false;
        boolean lower = false;
        String userName = "";

        System.out.println("Hello! What is your name?");

        //line to receive user input
        userName = sc.nextLine();
        System.out.println("Well " + userName + ", I am thinking of a number between 1 and 20" +
                " Take a guess.");

        for(Integer i = 1; i <= tries; i++){

            Integer guess = sc.nextInt();

            if (guess == number){
                System.out.println("Good Job, "+ userName + "! You guessed my number in" + i.toString()+
                       " guesses!" );
                System.out.println("Would you like to play again? (y/n)");
                String response = sc.nextLine();
                if (response.equals("y")){
                    guessTheNumber();
                    return;
                }
                break;
            }
            else if (number < guess ){
                System.out.println("Your guess is too high"
                +" Take a guess");
            }
            else if (number > guess){
                System.out.println("Your guess is too low"
                        +" Take a guess");
            }
            if (i == tries) {
                System.out.println(
                        "You have exhausted"
                                + tries.toString() + "trials.");

                System.out.println(
                        "The number was " + number);
            }
        }
    }
    public static void main(String[] args) {
        //function call
        guessTheNumber();
    }
}
