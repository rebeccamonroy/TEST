import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Board {

    public static Random wordSelector = new Random();
    Scanner scan = new Scanner(System.in);
    ArrayList<String> array = new ArrayList<>();

    public static void showOnBoard(ArrayList<String> array, int attempts) {
        for (int x = 0; x < array.size(); x++) {
            System.out.println(x);
        }
        System.out.println("Te queda " + attempts + " intentos");
    }

    public static boolean getWinner(ArrayList<String> array, String guessWord, int attempts) {
        String secretWord = "";
        for (int i = 0; i < array.size(); i++) {
            secretWord += i;
        }

        if (secretWord.equals(guessWord)) {
            System.out.println("GANASTES");
        } else {
            System.out.println("Perdistes todos tus intentos :(");
            return false;
        }
        return true;
    }

}
