public class Customer {

    private String name;
    private String address;
    private int turnOver;
    private boolean goldStatus;

    public Customer(String name, String address, int turnOver) {
        this.name = name;
        this.address = address;
        this.turnOver = turnOver;
        this.goldStatus = turnOver > 2000;
    }

    public double toPay(int price) {
        if (goldStatus) {
            return price * 0.95; // Apply a 5% discount
        } else {
            return price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(int turnOver) {
        this.turnOver = turnOver;
        this.goldStatus = turnOver > 2000; // Update goldStatus based on the new turnOver value
    }

    public boolean isGoldStatus() {
        return goldStatus;
    }

    public void setGoldStatus(boolean goldStatus) {
        this.goldStatus = goldStatus;
    }
}
