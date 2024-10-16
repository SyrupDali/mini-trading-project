import java.util.ArrayList;
import java.util.List;

public class MarketData {
    private List<Double> prices = new ArrayList<>();

    public void loadMarketData(String filePath) {
        // Logic to read historical prices from CSV and populate prices list
        // For simplicity, we will use dummy data for now
        prices.add(100.0);
        prices.add(101.5);
        prices.add(99.0);
    }

    public List<Double> getPrices() {
        return prices;
    }
}
