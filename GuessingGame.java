import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctName = "Huy";
        String userGuess;
        int guessCounter = 0;
        boolean gameWon = false;

        System.out.println("Please, guess my name.");
        userGuess = scanner.nextLine();
        guessCounter++;

        if (userGuess.equalsIgnoreCase(correctName)) {
            gameWon = true;
        }


        while (!userGuess.equalsIgnoreCase(correctName)) {
            System.out.println("Do you want to quit (y/n) ?");
            String quitQuestion = scanner.nextLine().toLowerCase();
            if (quitQuestion.equals("y")) {
                scanner.close();
                return;
            }
            guessCounter++;
            System.out.println("Please, guess my name.");
            userGuess = scanner.nextLine();
            
            if (userGuess.equalsIgnoreCase(correctName)) {
                gameWon = true;
            }
        }



        if (gameWon) {
            System.out.println(correctName);
            System.out.println("Congratulations!");
            System.out.println("Guesses: " + guessCounter);
        }





        scanner.close();
    }
}
