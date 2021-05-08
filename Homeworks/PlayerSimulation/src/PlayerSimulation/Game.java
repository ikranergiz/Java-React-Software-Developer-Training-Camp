package PlayerSimulation;

public class Game {
    private String name;
    private double price;
    private double discountRate;
    private double priceAfterDiscount;
    private boolean isCampaign;


    public Game(String name,double price,double discountRate){
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.isCampaign  = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getPriceAfterDiscount() {
        return getPrice() - getPrice()*getDiscountRate();
    }
    public boolean isCampaign() {
        return isCampaign;
    }

    public void setCampaign(boolean isCampaign) {
        this.isCampaign = isCampaign;
    }


}
