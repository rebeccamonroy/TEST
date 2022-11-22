public class Main {

    public static void main(String[] args) {

        // TicTacToeEngine ttt = new TicTacToeEngine();
        // ttt.makeMove(0, 0);

        char[][] boardArray = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };

        // PARA MOSTRAR EL TABLERO DEL JUEGO
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
}
