public class Game {

    private int id;
    private String title;
    private String console;
    private int players;

    public Game() {
    }

    public Game(String console, int id, int players, String title) {
        this.console = console;
        this.id = id;
        this.players = players;
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "title: " + title + " console: " + console + " players: " + players;
    }
}
