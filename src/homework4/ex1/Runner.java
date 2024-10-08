package homework4.ex1;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        ArrayList<Car> cars = new ArrayList<>();
        //создание автомобилей и добавление в список
        for (int i = 0; i < 4; i++) {
            cars.add(new Automobile(1.8, 2.1, 5, true));
        }
        //создание автобусов и добавление в список
        for (int i = 0; i < 5; i++) {
            cars.add(new Bus(2.3, 3, 12, 50));
        }
        System.out.println("За мойку нужно будет заплатить: " + carWash.washCars(cars));
    }
    //Создать легковую машину (атрибуты: чистая/грязная, размеры(ширина,высота,длина), наличие круиз контроля)
    //Создать автобус (атрибуты: чистый/грязный, размеры(ширина,высота,длина), макс количество пассажиров)
    //Создать автомойку
    //Автомойка умеет мыть машину. Делает машину чистой. Возвращает стоимость помывки.
    //Автомойка умеет мыть машины. Делает машины чистыми. Возвращает стоимость помывки за все машины.
    //Категории автомобилей:
    //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
    //иначе считается маломерной.
    //тариф 4000 - для крупных авто.
    //тариф 2000 - для маломерных.
    //В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
    //5 автобусов(12х3х2.3)
    //Посчитать и вывести: сколько мэрия заплатит денег за мойку всех машин.
}
