
public class Board {

    private final int BOARD_SIZE = 3;
    private Piece[][] square;
    private Piece winner;
    

    public Board(){
        square = new Piece[BOARD_SIZE][BOARD_SIZE];
        for(int i =0; i< square.length;j++){
            for(int j =0; j< BOARD_SIZE;j++){
                square[i][j] = Piece.EMPTY;
            }
        }
    }

    public boolean isWinner(Player player1) {
        Piece piece = player1.getPiece();
        return false;
    }

    public boolean isFull() {
        if(winner != Piece.EMPTY){
            return true;
        }

        for(int i =0; i< BOARD_SIZE; i++){
            for(int j =0; j<BOARD_SIZE; j++){
                if(square[i][j] == Piece.EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean winInvertedDiagonal(Piece piece){
        int cont =0;
        for(int i =0; i< BOARD_SIZE;i++){
            if(square[i][i]== piece){
                cont++;
            }
        }
        if(cont == BOARD_SIZE){
            this.winner = piece;
            return true;
        }
        return false;
    }

    public boolean putPiece(Coordinate coordinate, Piece piece) {
        if(piece == Piece.EMPTY){
            return false;
        }

        if(square[coordinate.getX()][coordinate.getX()] == Piece.EMPTY){
            square[coordinate.getX()][coordinate.getX()] =piece;
            return true;
        }
        //podria revisar al ganador
        return false;
    }

    private boolean winVertical(Piece piece){
        for(int i =0; i < BOARD_SIZE; i++){
            int cont =0;
            for(int j=0; j< BOARD_SIZE; j++){
                if(square[j][i]== piece){
                    cont++;
                }
                if(cont == BOARD_SIZE){
                    this.winner =piece;
                    return true;
                }
            }
        }
        return false;
    }

    public Player getWinner() {
        return null;
    }

}
