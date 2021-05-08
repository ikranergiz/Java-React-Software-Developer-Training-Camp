package PlayerSimulation;

public class CampaignManager implements CampaignService{

    private Game game;
    public CampaignManager(Game game){
        this.game = game;
    }

    @Override
    public void add() {
        System.out.println("NEW CAMPAIGN");
        this.game.setCampaign(true);
        System.out.println("The price of the " + this.game.getName() + " has dropped from " + this.game.getPrice() + " to " +
                        this.game.getPriceAfterDiscount());

    }

    @Override
    public void delete() {
        System.out.println("CAMPAIGN OVER");
        this.game.setCampaign(false);
        System.out.println("The price of " + game.getName() + " increased from " + this.game.getPriceAfterDiscount() + " to "
                + this.game.getPrice());

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
