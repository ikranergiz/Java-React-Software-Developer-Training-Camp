package PlayerSimulation;

public class Player extends Member {
    private Game game;
    private double wallet;

    public Player(String firstName,String lastName,String nationalIdentity,int yearOfBirth,Game game,double wallet) {
        super(firstName,lastName,nationalIdentity,yearOfBirth);
        this.setGame(game);
        this.setWallet(wallet);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet; //!!!!!
    }
}
