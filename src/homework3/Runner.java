package homework3;

import homework3.ex4.City;
import homework3.ex4.House;
import homework3.factory.Iphone;
import homework3.factory.IphoneFactory;
import homework3.factory.Samsung;
import homework3.factory.SamsungFactory;
import homework3.pyramids.Pyramid1;
import homework3.shop.Customer;
import homework3.shop.Shop;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("_________________");
        ex2();
        System.out.println("_________________");
        ex3();
        System.out.println("_________________");
        ex4();
    }

    public static void ex1() {
        Shop shop = new Shop(true, false, 3);
        Customer customer = new Customer("Василий");
        customer.checkShop(shop);
    }

    public static void ex2() {
        Samsung samsung = SamsungFactory.createPhone();
        Iphone iphone = IphoneFactory.createPhone();

        samsung.takePhoto();
        iphone.takePhoto();
        iphone.printProcessorInfo();
    }

    public static void ex3() {
        Pyramid1 pyramid = new Pyramid1();
        pyramid.print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {
        House firstHouse = new House("Ленина", 1);
        House secondHouse = new House("Ленина", 2);
        City city = new City("Москва", firstHouse, secondHouse);

        House house = city.getHouses()[0];
        house.setStreetName("Котова");
        System.out.println(house);

        System.out.println(city);

    }
}
