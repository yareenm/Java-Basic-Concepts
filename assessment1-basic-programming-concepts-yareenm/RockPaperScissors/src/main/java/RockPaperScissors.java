import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //declare variables
        Scanner inputSc=new Scanner(System.in);
        int rounds, tiesRounds=0,userWinRounds=0,computerWinRounds=0;
        String[] names = new String[]{"Rock","Paper","Scissors"};
        String userChoice, compChoice, playAgain;
        Random rndObject = new Random();
        boolean user=false;

            while(true) {
                // get the user input number of rounds they want to play
                System.out.println("How many rounds do you want to play?: ");
                rounds = Integer.parseInt(inputSc.nextLine());

                // check the range for the number of rounds
                // if the number is not in range show an error message and exit the program.
                if(rounds>10 || rounds<1){
                    System.out.println("Maximum number of rounds 10, minimum number of rounds is 1 !!!!!");
                    System.exit(0);
                }
                // game begins here
                while (rounds > 0) {
                    System.out.println("What is your choice ?(Rock - Paper - Scissors) ");
                    userChoice = inputSc.nextLine();
                    System.out.println("Your move: " +userChoice);

                    if (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
                        System.out.println("You entered incorrect value for the game!!!");
                        System.out.println("What is your choice ?(Rock - Paper - Scissors) ");
                        userChoice = inputSc.nextLine();
                        System.out.println("Your move: " +userChoice);
                    }// if the user enters incorrect value, warn the user and ask for correct value

                    int index = rndObject.nextInt(names.length);
                    compChoice = names[index];
                    System.out.println("Computer move: " +compChoice);

                    //the game rules
                    if(userChoice.equals(compChoice)){
                        System.out.println("Game is tie!!");
                        tiesRounds++;
                    }
                    else if(userChoice.equals("Rock") && compChoice.equals("Scissors")){
                        userWinRounds++;
                    }
                    else if(userChoice.equals("Paper") && compChoice.equals("Rock")){
                        userWinRounds++;
                    }
                    else if(userChoice.equals("Scissors") && compChoice.equals("Paper")){
                        userWinRounds++;
                    }
                    else{
                        computerWinRounds++;
                    }
                    rounds--;
                }// inner while

                // final status about game
                System.out.println("Number of ties: " + tiesRounds);
                System.out.println("Number of user wins: "+ userWinRounds);
                System.out.println("Number of computer wins: "+computerWinRounds);

                // winner announcement
                if(computerWinRounds>userWinRounds){
                    System.out.println("Computer won!!!");
                }
                else if(userWinRounds >computerWinRounds){
                    System.out.println("You won!!!!");
                }
                else{
                    System.out.println("It is a tie!! No overall winner!");
                }

                // ask to user if she/he want to play again
                System.out.println("Would you like to play again? (Yes or No) ");
                playAgain = inputSc.nextLine();
                if(playAgain.equals("No")){
                    System.out.println("Thanks for playing!");
                    break;
                }
            }// create an infinity loop if the user wants to play again or multiple times.
    }
}
