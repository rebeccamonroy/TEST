public class Player {

    private String name;
    private Board board;

    public Player(String playerName) {
        this.name = playerName;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + "]";
    }

    public void validateLetters() {
        char letter = Input.getString("Type a letter ").toCharArray()[0];// otro lado para validar
        if (board.tryHintCharacter(letter)) {
            System.out.println("Correct letter!!\n");
        } else {
            System.out.println("Try again:( \n");
        }
    }

}
