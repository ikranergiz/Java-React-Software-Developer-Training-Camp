package PlayerSimulation;

public class SalesManager implements SalesService{
    private Game game;
    private CampaignService campaignService;


    public SalesManager(Game game) {
        this.game = game;
    }
    public SalesManager(Game game,CampaignService campaignService) {
        this.game = game;
        this.campaignService = campaignService;
    }


    @Override
    public void buyGame(Player player) {
        if(game.isCampaign()) {
            System.out.println(this.game.getName() + " price:  " + game.getPriceAfterDiscount() + " was purchased by : " + player.getFirstName());
        }
        else{
            System.out.println(this.game.getName() + " price:  " + game.getPrice() + " was purchased by : " + player.getFirstName());
        }

    }
}
