package homework2.office;

public class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
