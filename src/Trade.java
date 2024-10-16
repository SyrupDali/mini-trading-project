public class Trade {
    private String type; // "BUY" or "SELL"
    private int quantity;

    public Trade(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
