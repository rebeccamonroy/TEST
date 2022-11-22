public class Hangman {

    private WordBankType wordBankType;
    private Board board;
    private Turn turn;
    private Player player;

    public Hangman() {
        board = new Board();
    }

    public void initGame() {
        System.out.println("   *************************");
        System.out.println("   *        HANGMAN        *");
        System.out.println("   *************************\n");

        player = createGuessPlayer();
        turn = new Turn(player, board);
        generateSecretWord();

    }

    public void play() {
        turn = new Turn(player, board);
        turn.execute();
    }

    public void showResult() {
        board.showResult();
    }

    public Player createGuessPlayer() {
        System.out.println("\nCreating new player");
        Player result;
        String playerName = Input.getString("Type your name: ");
        result = new Player(playerName);
        System.out.println(
                "\n" + playerName.toUpperCase() + " has been created successfully\n");
        return result;
    }

    private void generateSecretWord() {// generar la palabra
        String secretWordGenerated = null;
        int option = 0;

        do {
            option = Input
                    .getInteger(
                            "Choose (PLAYER) any option:\n0. EASY\n1. DIFFICULT\n2.VERY DIFFICULT\nType your option here: ");

            switch (option) {
                case 0:
                    secretWordGenerated = wordBankType.EASY.getRandomWord();
                    break;
                case 1:
                    secretWordGenerated = wordBankType.DIFFICULT.getRandomWord();
                    break;
                case 2:
                    secretWordGenerated = wordBankType.VERYDIFFICULT.getRandomWord();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (option != 0 && option != 1 && option != 2);
        board.setSecretWord(secretWordGenerated);
        System.out.println("Word was generated. Word has " + secretWordGenerated.length() + " characters");
    }

}
