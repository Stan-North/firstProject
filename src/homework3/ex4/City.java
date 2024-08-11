package homework3.ex4;

public final class City {
    private final String cityName ;
    private final House[] houses;

    public City(String cityName, House... houses ) {
        this.cityName = cityName;
        this.houses = houses;
    }

    @Override
    public String toString() {
        String result = "";
        for (House house : houses) {
            result += house.toString() + "\n";
        }
        return "Название города: " + cityName + "\n" + result;
    }

    public String getCityName() {
        return cityName;
    }

    public House[] getHouses() {
        House[] newHouses = this.houses.clone();
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = newHouses[i].createClone();
            }
        return newHouses;
    }
}
