import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        HangmanEngine hEngine = new HangmanEngine();
        try (Scanner scanner = new Scanner(System.in)) {
            hEngine.initGame(scanner);
        }

    }
}
