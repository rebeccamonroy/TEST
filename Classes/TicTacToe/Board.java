public class Board {

    static char[][] boardArray = { { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' } };

    // PARA MOSTRAR EL TABLERO DEL JUEGO
    public static void printBoard() {
        int y = 0, x = 0, z = 0;
        myFirstLoop: for (x = 0; x < boardArray.length;) {
            mySecondLoop: for (y = 1; y < boardArray.length;) {
                myThirdLoop: for (z = 2; z < boardArray.length;) {
                    System.out.println("-----");
                    System.out.println("|TICTACTOE BOARD|");
                    System.out.println("----------------");
                    System.out.println(
                            "|  " + boardArray[x][x] + " |  " + boardArray[x][y] + "  | " + boardArray[x][z] + "  |");
                    System.out.println("----------------");
                    System.out.println(
                            "|  " + boardArray[y][x] + " |  " + boardArray[y][y] + "  | " + boardArray[y][z] + "  |");
                    System.out.println("----------------");
                    System.out.println(
                            "|  " + boardArray[z][x] + " |  " + boardArray[z][y] + "  | " + boardArray[z][z] + "  |");
                    break myThirdLoop;
                }
                break mySecondLoop;
            }
            break myFirstLoop;
        }
    }

    // CHECK IF IT IS VALID
    public static boolean isValid(int x, int y, char[][] board) {
        if (x >= 0 && x < board.length && y >= 0 && y < board.length) {
            if (board[x][y] == ' ' && board[x][y] == ' ') {
                return true;
            }
        }
        return false;
    }

    // Victory with X -> filas
    public boolean xVictory(char letter, char[][] board) {
        for (int x = 0; x < board.length; x++) {
            if (board[x][0] == letter && board[x][1] == letter && board[x][2] == letter) {
                return true;
            }
        }
        return false;
    }

    // Victory with Y -> columnas
    public boolean yVictory(char letter, char[][] board) {
        for (int y = 0; y < board.length; y++) {
            if (board[0][y] == letter && board[1][y] == letter && board[2][y] == letter) {
                return true;
            }
        }
        return false;
    }

    // Victory in diagonal position -> cuando sea la victoria en diagonal
    public boolean dgnlVictory(char letter, char[][] board) {
        if (board[1][1] != letter) {
            return false;
        }
        if ((board[0][0] != letter) && (board[2][2] == letter)) {
            return true;
        }
        if ((board[0][2] != letter) && (board[2][0] == letter)) {
            return true;
        }
        return false;
    }
}
