public class Main {
    public static void main(String[] args) {
        // Create instances of Good and PerishableGood
        Good nonPerishable = new Good("A123", 100, true);
        PerishableGood perishable = new PerishableGood("B456", 150, true, 100);

        // Create instances of Customer with different turnOver values
        Customer regularCustomer = new Customer("Ahmad Sedeek", "35 ElSharbatly St", 1800);
        Customer goldCustomer = new Customer("Maysa Sedeek", "456 ElFanar St", 2500);

        // Test the sellable() method for PerishableGood
        System.out.println("Perishable good sellable? " + perishable.sellable());

        // Test the toPay() method for regular and gold customers
        System.out.println("Regular customer price: " + regularCustomer.toPay(nonPerishable.getPrice()));
        System.out.println("Gold customer price: " + goldCustomer.toPay(nonPerishable.getPrice()));

        // Test the toPay() method for regular and gold customers with a perishable good
        System.out.println("Regular customer price (perishable): " + regularCustomer.toPay(perishable.getPrice()));
        System.out.println("Gold customer price (perishable): " + goldCustomer.toPay(perishable.getPrice()));


    }

}