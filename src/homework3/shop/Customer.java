package homework3.shop;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
        if (shop.isClearFloor() && shop.isWorkersHasBadge() ||
            shop.isClearFloor() && (shop.getCountWorkers() > 2) ||
            shop.isWorkersHasBadge() && (shop.getCountWorkers() > 2)) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
