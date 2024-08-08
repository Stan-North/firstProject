package homework2.office;

public class Security {
    private String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askMoney() {
        System.out.println("Дайте аванс!");
    }
}
