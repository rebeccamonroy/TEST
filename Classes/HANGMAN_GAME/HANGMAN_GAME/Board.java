public class Board {

    private int maxAttempts;
    private int counter;
    private SecretWord secretWord;

    public Board() {
        counter = 0;
    }

    public boolean tryHintCharacter(char letter) {
        if (secretWord.exists(letter)) {
            System.out.println("Your letter match with the secret word!!");
            return true;
        }
        counter++;
        System.out.println("Sorry, it didn't match. You have " + (maxAttempts - counter) + " attempts left");
        return false;
    }

    public boolean tryHintWord(String word) {
        if (secretWord.isWord(word)) {
            System.out.println("YOU WIN!!!");
            return true;
        }
        counter = maxAttempts;
        System.out.println(" You didn't find out the secret word. The secret word was " + secretWord.getUnHiddenWord());
        return false;
    }

    public void printBoard() {
        System.out.println("Current Status: you have " + maxAttempts + " available attempts and you've used " + counter
                + " attempts.");
        // System.out.println(" " + secretWord.getHiddenWord());
        hangmanIcon();
        System.out.println("\n");
    }

    public void hangmanIcon() {
        for (int i = 0; i < counter; i++) {
            System.out.println("-----------------");
            if (maxAttempts < counter) {
                System.out.println("|                |");
            }
            if (maxAttempts < counter) {
                System.out.println("|                0");
            }
            if (maxAttempts < counter) {
                System.out.println("|               \\ /");
            }
            if (maxAttempts < counter) {
                System.out.println("|                |");
            }
            if (maxAttempts < counter) {
                System.out.println("|               / \\");
            }
            if (maxAttempts < counter) {
                System.out.println("|");
            }
            System.out.println("----------------------");
        }
    }

    public void setSecretWord(String secretWord) {
        System.out.println("\nBOARD- ready to play");
        secretWord = Input.getString("\nType secret word: ");
        maxAttempts = Input.getInteger("\nType number of Attempts: ");
    }

    public boolean otherTurn() {
        return maxAttempts > counter;
    }

    public void showResult() {
        System.out.println("\n********* RESULT OF THE GAME ***********");
    }

    /*
     * public void validator() {
     * do {
     * printBoard();
     * char letter = Input.getString("Type your letter: ").toCharArray()[0];// otro
     * lado para validar
     * if (tryHintCharacter(letter)) {
     * System.out.println("Correct letter");
     * } else {
     * System.out.println("Wrong, try again");
     * }
     * } while (otherTurn());
     * }
     */

}
