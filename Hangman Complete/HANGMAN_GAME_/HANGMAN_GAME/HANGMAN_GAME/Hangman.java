
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
        System.out.println("\nCreate a new player\n");
        Player result;
        String playerName = Input.getString("Type your name: ");
        result = new Player(playerName);
        return result;
    }

    private void generateSecretWord() {
        String secretWordGenerated = "";
        int option = 0;

        do {
            option = Input
                    .getInteger(
                            "Choose "+player.toString()+" any option:\n0. EASY\n1. DIFFICULT\n2.VERY DIFFICULT\nType your option here: ");
            switch(option){
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
                System.out.println("Invalid option!\n");
            break;
            }            
        } while (option != 0 && option != 1 && option != 2);

        System.out.println("successfully Generated!!\n Your secret word has " + secretWordGenerated.length() + " characters");
        board.setSecretWord(secretWordGenerated);

    }
}
