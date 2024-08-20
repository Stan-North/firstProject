package homework4.ex4;

public class Elephant extends Herbivore {
    private static final String RUN_MESSAGE = "Слон медленно бежит";

    public Elephant(int weight) {
        super(weight);
    }

    @Override
    public void run() throws AliveException {
        super.run();
        System.out.println(RUN_MESSAGE);
    }

    @Override
    public String printName() {
        return "Слон";
    }
}
