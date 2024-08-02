package homework2.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hurryUp(Manager manager) {
        System.out.println(manager.getName() + ", быстрее!");
    }
}
