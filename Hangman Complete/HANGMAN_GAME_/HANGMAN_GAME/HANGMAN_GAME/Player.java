public class Player {

    private String name;
    private Board board;

    public Player(String playerName) {

        this.name = playerName;
    }

    @Override
    public String toString() {
        return name;
    }

}
