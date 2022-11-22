public class Turn {

    public Board board;
    public Player player;
    public Player player2;

    public Turn(Player player, Board board) {
        this.board = board;
        this.player = player;
    }

    public void execute() {
        do {
            char letter = Input.getString("Type a letter: ").charAt(0);

        }while (!board.otherTurn()) ;
    }

    public void askPlayerSecretWord() {
        String secret = Input.getString("Type a secret word for the player: ");
    }

    public void askPlayerAttempts() {
        int attempts = Input.getInteger("Type number of attempts: ");
    }

}
