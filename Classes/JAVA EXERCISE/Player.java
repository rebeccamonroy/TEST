
public class Player {

    private String name;
    private Piece piece;

    Player(String name, Piece piece){
        this.name = name;
        this.piece =piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public Coordinate putPiece(Piece[][]squares){
        return null;
    }

    public abstract Coordinate getCoordinate(Piece[][]square);
    

}
