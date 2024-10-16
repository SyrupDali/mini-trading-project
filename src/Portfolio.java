import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Trade> trades = new ArrayList<>();

    public void executeTrade(Trade trade) {
        trades.add(trade);
        System.out.println("Executed trade: " + trade.getType() + " " + trade.getQuantity());
    }

    public void printPortfolio() {
        System.out.println("Portfolio trades:");
        for (Trade trade : trades) {
            System.out.println(trade.getType() + " " + trade.getQuantity());
        }
    }
}
