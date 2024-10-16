public class Trade {
    private TradeType type;
    private int quantity;

    public Trade(TradeType type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public TradeType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
