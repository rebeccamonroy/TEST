
public class Hangman {

    private WordBankType wordBankType;
    private Board board;
    private Turn turn;
    private Player player;

    public Hangman() {
        board = new Board();
    }

    public void initGame() {
        System.out.println("******** HANGMAN ********");

        player = createGuessPlayer();
        generateSecretWord();
        // player = createGuesserPlayer();
        // player = createGivenWordPlayer();
        // turn = new Turn(wordGiven, wordGuesser, board);
        turn = new Turn(player, board);
    }

    public void play() {
        turn = new Turn(player, board);
        turn.execute();
    }

    public void showResult() {
        System.out.println(board.wasGuessed());
    }

    public Player createGuessPlayer() {
        System.out.println("esta es la vreacion del jugador que adivina");
        Player result;
        String playerName = Input.getString("Type your name: ");
        result = new Player(playerName);
        return result;
    }

    private void generateSecretWord() {// generar la palabra
        String secretWordGenerated = "";
        int option = 0;

        do {
            option = Input
                    .getInteger(
                            "Choose (PLAYER) any option:\n0. EASY\n1. DIFFICULT\n2.VERY DIFFICULT\nType your option here: ");

            if (option == 0) {
                secretWordGenerated = wordBankType.EASY.getRandomWord();
            } else if (option == 1) {
                secretWordGenerated = wordBankType.DIFFICULT.getRandomWord();
            } else if (option == 2) {
                secretWordGenerated = wordBankType.VERYDIFFICULT.getRandomWord();
            } else {
                System.out.println("Invalid option!\n");
            }
        } while (option != 0 && option != 1 && option != 2);

        System.out.println("successfull, the word has " + secretWordGenerated.length() + " characters");
        board.setSecretWord(secretWordGenerated);
    }
}
