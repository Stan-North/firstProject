package homework4.ex3;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        Soundable[] soundables = new Soundable[]{human, builder, driver, bird};
        for (Soundable soundable : soundables) {
            System.out.println(soundable.makeSound());
        }
    }
    //Задача №3 - Звук вокруг
    //Человек умеет издавать звук: "Я человек." (возвращается строка и в след пунктах тоже)
    //Строитель умеет издавать звук: "Я строитель." + звук из человека
    //Водитель умеет издавать звук: "Я водитель." (водитель является человеком,
    // но не использует его родительский метод)
    //Птица умеет издавать звук: "Чирик"
    //Сделать так, чтобы они все могли быть представлены к единому типу - "Издающий звук".
    //Создать в этом методе человека, строителя, водителя и птицу. Запихнуть в единый массив.
    //Пройтись по массиву и заставить их издать звуки.
}
