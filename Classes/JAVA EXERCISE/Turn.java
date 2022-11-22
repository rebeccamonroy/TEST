
public class Turn {

    private Player player1;
    private Player player2;
    private Board board;

    public Turn(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    public void execute() {
        
        for(int i=0; i< 2;i++){
            executeTurn(player1);
            executeTurn(player2);
        }
        Player winner = null;

        while(!board.isFull()){
            executeTurn(player1);
            if(board.isWinner(player1)){
                winner = player1;
                break;
            }
            executeTurn(player2);
            if(board.isWinner(player2)){
                winner= player2;
                break;
            }
        }
    }

    private void executeTurn(Player player) {
        boolean isValid = false;
      //  int x =0;
      // int y =0;
        do{
            System.out.println("Turno del jugador " + player.toString());
      
            //      x = Terminal.getInteger("Ingrese la coordenada x");
      //      y = Terminal.getInteger("Ingrese la coordenada y");
            isValid = board.putPiece(new Coordinate(x,y), player.getPiece());
            if(!isValid){
                System.out.println("El tiro fue invalido, vuelve a intentar");
            }
        }while(!isValid);
    }

    public Player getWinner(){
        Piece piece = board.getWinner();
        if(piece  == Piece.EMPTY){
            return null;
        }
        if(player1.getPiece() == piece){

        }
    }
}
