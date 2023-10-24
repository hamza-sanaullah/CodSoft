//....................<Importing Required Classes>.......................
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

//<..............Creating the Game Class>.....................
class Number_Guessing_Game {
//    ......................<Making Private Attributes>................
    private static final int Max_chances = 10;
    private static final int Number_range = 100;
    private static final int Warning = 2;

//    ....................<Making Playgame Method>................................
    public void PlayGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> userguesses = new ArrayList<>();
        int score = 0;
        System.out.println("............................<WELCOME TO THE NUMBER GUESSING GAME>............................");
        while (true) {
            int chances = Max_chances;
            int random_number = random.nextInt(Number_range);
            int warning = Warning;

            System.out.println("You have " + chances + " Chances To Guess The Number Between 0 and " + (Number_range - 1));
            for (int counts = 1; counts <= chances; counts++) {
                int Guesses_left = (chances - counts);

                System.out.println("Guess a number:");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (userguesses.contains(number)) {
                        System.out.println("You already guessed " + number + ". Please guess a different number.");
                        System.out.println("You have " + (warning) +"  " +"Left"+ " .After that you loose your Guesses");
                        warning--;
                        if (warning==0){
                            System.out.println("You have loose your one Guess");
                            counts++;
                        }
                        counts--; // Decrement the counts to give the user another chance
                        continue; // Continue the loop to allow the user to enter a valid number
                    }
                    userguesses.add(number);
                    System.out.println("The Number of Guesses Left: " + Guesses_left);

                    if (number < 0 || number >= Number_range) {
                        System.out.println("Please Enter a number between 0 and " + (Number_range - 1) + ".");
                        continue; // Continue the loop to allow the user to enter a valid number
                    }

                    if (number == random_number) {
                        System.out.println("-----------------------CONGRATULATIONS YOU GUESSED THE NUMBER-----------------------------");
                        score += 1;
                        System.out.println("Do You Want to continue the Game or Skip (Y/N");
                        
                        String again = scanner.next().toUpperCase();
                        if (again.equals("Y")) {
                        break;
                        }else {
                            System.exit(0);
                        }
                    } else if (number > random_number) {
                        System.out.println("Your Guess Is Greater Than The Number");
                        System.out.println("----------------------");
                    } else if (number < random_number) {
                        System.out.println("Your Guess Is Smaller  Than The Number");
                        System.out.println("----------------------");
                    }
                    System.out.println(userguesses);
                    System.out.println("-----------");
                } else {
                    System.out.println("Warning: Invalid input! Please enter a valid integer.");

                    System.out.println("----------------------");
                    warning--;
                    if (warning==0){
                        System.out.println("you have loose your one guess");
                        counts++;
                    }
                    scanner.next(); // Clear the scanner's buffer
                }
                if (Guesses_left == 0) {
                    System.out.println("Sorry! The number of chances are finished");
                    System.out.println("The correct number was: " + random_number);

                    // Ask the user if they want to play againain
                    System.out.println("Do you want to play againain? (Y/N)");
                    String playagainain = scanner.next().toUpperCase();
                    if (!playagainain.equals("Y")) {
                        System.out.println("Final score: " + score);
                        System.out.println("The Game is over");
                        return;
                    } else {
                        userguesses.clear(); // Clear the user guesses for the new game
                        break; // Exit the for loop and start a new game
                    }
                }
            }


        }
    }
}

public class GAME {
    public static void main(String[] args) {
        Number_Guessing_Game numberGuessingGame = new Number_Guessing_Game();
        numberGuessingGame.PlayGame();
    }
}
