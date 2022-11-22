public class TicTacToeEngine {
    private Symbol symbol;
    
    public void initGame() {
        System.out.println("Welcome to TIC TAC TOE GAME!!\n");

    }

    public void makeMove(int x, int y) {
        if (Board.isValid(x, y, Board.boardArray)) {
            Board.boardArray[x][y] = symbol.valueOf(Symbol.X);
        } else {
            System.out.println("Invalid!!");
        }
    }

}
