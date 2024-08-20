package homework4.ex4;

public class Wolf extends Predator {

    public Wolf(int weight) {
        super(weight);
    }

    @Override
    public String printName() {
        return "Волк";
    }
}
