public class TradingStrategy {
    public String generateSignal(MarketData marketData) {
        // Simple strategy: Buy if the last price is lower than the previous one
        double[] prices = marketData.getPrices().stream().mapToDouble(Double::doubleValue).toArray();

        if (prices.length < 2) {
            return "HOLD"; // Not enough data
        }

        double lastPrice = prices[prices.length - 1];
        double previousPrice = prices[prices.length - 2];

        if (lastPrice < previousPrice) {
            return "BUY"; // Buy signal, as price is decreasing
        } else {
            return "SELL";
        }
    }
}
