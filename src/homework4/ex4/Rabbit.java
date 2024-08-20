package homework4.ex4;

public class Rabbit extends Herbivore {
    private static final String RUN_MESSAGE = "Кролик быстро бежит";

    public Rabbit(int weight) {
        super(weight);
    }

    @Override
    public void run() throws AliveException  {
        super.run();
        System.out.println(RUN_MESSAGE);
    }

    @Override
    public String printName() {
        return "Кролик";
    }
}
