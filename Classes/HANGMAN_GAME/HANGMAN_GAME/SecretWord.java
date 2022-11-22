public class SecretWord {

    private String secretWord;

    public SecretWord(String secretWordGenerated) {
    }

    public String getHiddenWord() {
        for (int i = 0; i < secretWord.length();) {
            return "-";
        }
        return "";
    }

    public boolean exists(char letter) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public boolean isWord(String word) {
        return false;
    }

    public String getUnHiddenWord() {
        return null;
    }

}
