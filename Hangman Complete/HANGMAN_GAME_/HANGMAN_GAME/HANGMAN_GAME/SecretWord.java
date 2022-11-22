
public class SecretWord {

    private String secretWord;
    private Board board;

    public SecretWord(String secretWord) {
    }

    public String getHiddenWord() {
      String word = String.valueOf(WordBankType.valueOf(board.getSecretWord().toString()));
      int count = word.length();
      char [] hide = word.toCharArray();
      for(int i=0; i<hide.length;i++){
          hide[i] = '-';
          System.out.println(hide[i]);
      }
        return null;
    }

    public boolean exists(char letter) {
     /*   for (int i = 0;;) {
            if (letter == secretWord.charAt(i)) {
                return true;
            }
            }*/
            return false;
    }

    public boolean isWord(String word) {

        return true;
    }

    public String getUnHiddenWord() {
        return secretWord;
    }

}
