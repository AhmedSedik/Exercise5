public class Good {
    private String orderCode;
    private int price;
    private boolean availability;

    public Good(String orderCode, int price, boolean availability) {
        this.orderCode = orderCode;
        this.price = price;
        this.availability = availability;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
    //subclass
    class PerishableGood extends Good{
        private int bestBeforeDay;



        public PerishableGood(String orderCode, int price, boolean availability, int bestBeforeDay) {
            super(orderCode, price, availability); // Call the superclass constructor with the required arguments
            this.bestBeforeDay = bestBeforeDay;
        }

        public boolean sellable() {
            int currentDay = today();
            if (bestBeforeDay >= currentDay - 14) {
                return true;
            } else {
                return false;
            }
        }

        public static int today() {
            return 311;
        }
    }

