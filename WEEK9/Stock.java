public class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol, String name, double previousClosingPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public double getPercentage(double currentPrice, double previousClosingPrice){
        return (currentPrice - previousClosingPrice)/previousClosingPrice * 100;
    }
}