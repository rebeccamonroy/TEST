import java.util.Scanner;
import java.util.List;

public class Player {

   private String name;
   private String playerword;
   List<Character> playerGuess;

   public Player(String name, String playerword, List<Character> playerGuess) {
      this.name = name;
      this.playerword = playerword;
      this.playerGuess = playerGuess;
   }

   public String getName() {
      return name;
   }

   public String getPlayerword() {
      return playerword;
   }

   public List<Character> getPlayerGuess() {
      return playerGuess;
   }

   public boolean getPlayerGuess(Scanner scn, String playerword, List<Character> playerGuess) {
      System.out.println("Please enter a letter: ");
      String guessLetter = scn.nextLine();
      playerGuess.add(guessLetter.charAt(0));
      return playerword.contains(guessLetter);
   }

   @Override
   public String toString() {
      return "Player [name=" + name + ", playerword=" + playerword + ", playerGuess=" + playerGuess + "]";
   }

}
