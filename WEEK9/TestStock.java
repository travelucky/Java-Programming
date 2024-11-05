public class TestStock{
    public static void main(String[] args){
        Stock stock = new Stock("ORCL","Oracle Corporation",34.5);
        stock.setCurrentPrice(34.35);
        System.out.printf("The percentage of changed from previousClosingPrice to currentPrice is %.2f %%" ,stock.getPercentage(stock.currentPrice,stock.previousClosingPrice));
    }
}