public class TicTacToe{

    private Player player1;
    private Player player2;
    private Board board;
    private Turn turn;
    private Object piece;

    public TicTacToe(){
        initGame();
        play();
    }

    public void initGame(){
        player1 = createPlayer(Piece.X); 
        player2 = createPlayer(Piece.O);
        board = new Board();
        turn = new Turn(player1, player2, board);
    }

    public Player createPlayer(Piece piece){
        String name = Terminal.getString("Ingrese el nombre del jugador que utilizara la pieza "+ piece.toString());
        Player player = new Player(name, piece);
        return player;
    }

    public void play(){
        turn.execute();
    }

    public void showStatistcs(){
        //String name = 
    }


}