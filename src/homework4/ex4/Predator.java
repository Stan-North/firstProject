package homework4.ex4;

public abstract class Predator extends Alive {

    protected Predator(int weight) {
        super(weight);
    }

    public void attack(Alive animal) throws AliveException {
        if (this.isAlive()) {
            if (animal.getWeight() > this.getWeight()) {
                this.die();
                System.out.println(this.printName() + " умирает");
            } else {
                this.setWeight(this.getWeight() + (animal.getWeight() / 3));
                animal.die();
                System.out.println(animal.printName() + " умирает");
            }
        } else {
            throw new AliveException("Животное не может нападать");
        }
    }

}
