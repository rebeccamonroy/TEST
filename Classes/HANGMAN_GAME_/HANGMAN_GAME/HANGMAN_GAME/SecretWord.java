
public class SecretWord {

    private String secretWord;

    public SecretWord(String secretWord) {
    }

    public String getHiddenWord() {
        for (int i = 0; i < secretWord.length(); i++) {
            char letter = secretWord.charAt(i);

            if (letter == secretWord.charAt(i)) {
                return "" + letter;
            }
            return "-";
        }

        return "-";

    }

    public boolean exists(char letter) {
        for (int i = 0;;) {
            if (letter == secretWord.charAt(i)) {
                return true;
            }
            return false;
        }
    }

    public boolean isWord(String word) {

        return true;
    }

    public String getUnHiddenWord() {
        return null;
    }

}
