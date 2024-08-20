package homework4.ex4;

public abstract class Herbivore extends Alive {

    protected Herbivore(int weight) {
        super(weight);
    }

    public void run() throws AliveException {
        if (!this.isAlive()) {
            throw new AliveException("Животное не может бегать");
        }
    }
}
