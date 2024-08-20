package homework4.ex1;

import java.util.ArrayList;

public class CarWash {
    private static final int PRICE_FOR_BIG_CARS = 4000;
    private static final int PRICE_FOR_SMALL_CARS = 2000;

    public int washCar(Car car) {
        car.setClean(true);
        return isCarBig(car) ? PRICE_FOR_BIG_CARS : PRICE_FOR_SMALL_CARS;
    }

    public int washCars(ArrayList<Car> cars) {
        int priceSum = 0;
        for (Car car : cars) {
            priceSum += washCar(car);
        }
        return priceSum;
    }

    private boolean isCarBig(Car car) {
        return (car.getLenght() > 6) ||
                (car.getHeight() > 2.5) ||
                (car.getWidth() > 2);
    }
}
