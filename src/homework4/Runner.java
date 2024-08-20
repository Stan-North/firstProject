package homework4;


import homework4.ex1.Automobile;
import homework4.ex1.Bus;
import homework4.ex1.Car;
import homework4.ex1.CarWash;
import homework4.ex2.Duck;
import homework4.ex2.FlyException;
import homework4.ex2.Flyable;
import homework4.ex2.Plane;
import homework4.ex3.*;
import homework4.ex4.*;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("_____________________");
        ex2();
        System.out.println("_____________________");
        ex3();
        System.out.println("_____________________");
        ex4();
    }
    public static void ex1() {
        CarWash carWash = new CarWash();
        ArrayList<Car> cars = new ArrayList<>();
        //создание автомобилей
        for (int i = 0; i < 4; i++) {
            cars.add(new Automobile(1.8, 2.1, 5, true));
        }
        //создание автобусов
        for (int i = 0; i < 5; i++) {
            cars.add(new Bus(2.3, 3, 12, 50));
        }
        System.out.println("За мойку нужно будет заплатить: " + carWash.washCars(cars));
    }

    public static void ex2() {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Plane plane1 = new Plane(10);
        Plane plane2 = new Plane(-1);

        Flyable[] flyables = new Flyable[]{duck1, duck2, plane1, plane2};

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ex3() {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        Soundable[] soundables = new Soundable[]{human, builder, driver, bird};
        for (Soundable soundable : soundables) {
            System.out.println(soundable.makeSound());
        }
    }

    public static void ex4() {

        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        try {
            rabbit.run();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            wolf.attack(rabbit);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attack(wolf);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attack(elephant);
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            elephant.run();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            rabbit.run();
        } catch (AliveException e) {
            System.out.println(e.getMessage());
        }

    }
}

