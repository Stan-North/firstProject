package homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        House firstHouse = new House("Ленина", 1);
        House secondHouse = new House("Ленина" , 2);
        City city = new City("Москва" , firstHouse, secondHouse);

        System.out.println(city);
        System.out.println("___________________");

        House house = city.getHouses()[0];
        house.setStreetName("Котова");

        System.out.println(city);
    }

}
