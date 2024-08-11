package homework3.shop;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop(true, false, 3);
        Customer customer = new Customer("Василий");
        customer.checkShop(shop);
    }
}
