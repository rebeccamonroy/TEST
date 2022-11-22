public class Turn {

    public Board board;
    public Player player;

    public Turn(Player player, Board board) {
        this.board = board;
        this.player = player;
    }

    public void execute() {
        do {
            board.printBoard();
            char letter = Input.getString("Type your letter: ").toCharArray()[0];// otro lado para validar
            if (board.tryHintCharacter(letter)) {
                System.out.println("Correct letter");
            } else {
                System.out.println("Wrong, try again");
            }
        } while (board.otherTurn());
    }
}
