public class Main {
    public static void main(String[] args) {
        MarketData marketData = new MarketData();
        TradingStrategy strategy = new TradingStrategy();
        Portfolio portfolio = new Portfolio();

        // Simulate loading market data
        marketData.loadMarketData("data/historical_prices.csv");

        // Generate signals
        String signal = strategy.generateSignal(marketData);

        // Execute trade based on signal
        if ("BUY".equals(signal)) {
            Trade trade = new Trade("BUY", 100); // Buy 100 units
            portfolio.executeTrade(trade);
        }else if ("SELL".equals(signal)) {
            Trade trade = new Trade("SELL", 100); // Sell 100 units
            portfolio.executeTrade(trade);
        }

        // Print portfolio status
        portfolio.printPortfolio();
    }
}
