import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WordBank {

    private static HangmanEngine hangmanEngine;
    private static Player player;

    public void typeWord(int type) throws FileNotFoundException {
        Scanner scan;
        try {
            switch (type) {
                case 1:
                    scan = new Scanner(new File("C:/Users/rebecca.monroy01/Desktop/Hangman/Words/easy.txt"));
                    break;
                case 2:
                    scan = new Scanner(new File("C:/Users/rebecca.monroy01/Desktop/Hangman/Words/difficult.txt"));
                    break;
                case 3:
                    scan = new Scanner(new File("C:/Users/rebecca.monroy01/Desktop/Hangman/Words/verydifficult.txt"));
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void wordChoose() {
        try (Scanner scn = new Scanner(System.in)) {
            List<String> words = new ArrayList<>();

            while (scn.hasNext()) {
                words.add(scn.nextLine());
            }

            Random random = new Random();
            String secretWord = words.get(random.nextInt(words.size()));

            System.out.println(secretWord.toUpperCase());

            List<Character> playerGuess = new ArrayList<>();

            int wrongCounter = 0;
            while (true) {
                hangmanEngine.printHangedMain(wrongCounter);

                if (wrongCounter >= 6) {
                    System.out.println("You Lose!");
                    break;
                }
                hangmanEngine.printWord(secretWord, playerGuess);

                if (!player.getPlayerGuess(scn, secretWord, playerGuess)) {
                    wrongCounter++;
                }

                if (hangmanEngine.printWord(secretWord, playerGuess)) {
                    System.out.println("YOU WIN!!");
                    break;
                }

                System.out.print("Please enter your letter: ");
                if (scn.nextLine().equals(secretWord)) {
                    System.out.println("YOU WIN!!");
                    break;
                } else {
                    System.out.println("Try again!!");
                }

            }
        }
    }
}
