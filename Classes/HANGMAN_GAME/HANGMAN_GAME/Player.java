public class Player {

    private String name;

    public Player(String playerName) {
        this.name = playerName;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + "]";
    }

}
