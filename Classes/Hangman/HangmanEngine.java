import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class HangmanEngine {

    private WordBank wordBank;
    private Player player;

    public void initGame(Scanner sc) throws FileNotFoundException {
        HangmanEngine hg;
        System.out.println("DIFFICULTY LEVEL");
        System.out.println("1. Easy\n2. Difficulty \n3.Very Difficult ");
        int type = sc.nextInt();
        System.out.println(type);
        List<Character> playerGuessLetter;
        wordBank.wordChoose();
        wordBank.typeWord(type);

    }

    // PARA MOSTRAR EL HANGMAN
    public static void printHangedMain(int wrongCounter) {

        System.out.println(" ------------\n |         |");
        if (wrongCounter >= 1) {
            System.out.println(" O");
        }
        if (wrongCounter >= 2) {
            System.out.print("\\ ");
            if (wrongCounter >= 3) {
                System.out.println("/");
            } else {
                System.out.println("");
            }
        }
        if (wrongCounter >= 4) {
            System.out.println(" |");
        }

        if (wrongCounter >= 5) {
            System.out.print("/ ");
            if (wrongCounter >= 6) {
                System.out.println("\\");
            } else {
                System.out.println("");
            }
        }
    }

    public static boolean printWord(String secretWord, List<Character> playerGuessLetter) {
        int counterLetter = 0;
        for (int i = 0; i < secretWord.length(); i++) {
            if (playerGuessLetter.contains(secretWord.charAt(i))) {
                System.out.print(secretWord.charAt(i));
                counterLetter++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        return (secretWord.length() == counterLetter);
    }

}
