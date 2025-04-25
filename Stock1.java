public class Stock1 {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    //Create constructor 
    public Stock1(String symbol, String name) {
		// this keyword
        this.symbol = symbol;
        this.name = name;
    }
    public void setPreviousClosingPrice(double price) {
        previousClosingPrice = price;
    }
    public void setCurrentPrice(double price) {
        currentPrice = price;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    public static void main(String[] args) {
        Stock1 oracleStock = new Stock1("ORCL", "Oracle Corporation");

        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(34.35);

        double priceChangePercent = oracleStock.getChangePercent();

        System.out.println("Stock Symbol: " + oracleStock.symbol);
        System.out.println("Stock Name: " + oracleStock.name);
        System.out.println("Previous Closing Price: $" + oracleStock.previousClosingPrice);
        System.out.println("Current Price: $" + oracleStock.currentPrice);
        System.out.println("Price Change Percentage: " + priceChangePercent + "%");
    }
}