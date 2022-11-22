
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
        System.out.println(" You lose. Secret word was: " + secretWord.getUnHiddenWord());
        return false;
    }

    public void printBoard() {
        System.out.println("Current Status: you have " + maxAttempts + " available attempts and you've used " + counter
                + " attempts.");
        System.out.println("Word Status:");
        System.out.println("            " + secretWord.getHiddenWord());
        hangmanIcon();
        System.out.println("\n\n");
    }

    public boolean wasGuessed() {

        return false;
    }

    public void hangmanIcon() {
        System.out.println("    HANGMAN ICON\n----------");
        System.out.println("|         |");
        switch (maxAttempts) {
            case 0:
                System.out.println("|         0");
                break;
            case 1:
                System.out.println("|        \\ /");
                break;
            case 2:
                System.out.println("|         |");
                break;
            case 3:
                System.out.println("|        / \\");
                break;
            case 4:
                System.out.println("|");
                break;
            case 5:
                System.out.println("----------------");
                break;
            default:
                System.out.println("");
        }
    }

    public void setSecretWord(String secretWordGenerated) {
        System.out.println("BOARD- ready to play");
        maxAttempts = 5;
        secretWord = new SecretWord(secretWordGenerated);
    }

    public String getSecretWord() {
        return secretWord.getHiddenWord();
    }

    public boolean otherTurn() {
        return maxAttempts > counter;
    }

}
