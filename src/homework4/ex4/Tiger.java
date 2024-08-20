package homework4.ex4;

public class Tiger extends Predator {

    public Tiger(int weight) {
        super(weight);
    }

    @Override
    public void attack(Alive animal) throws AliveException {
        if (this.isAlive()) {
            if (animal.getWeight() > (this.getWeight() * 2)) {
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

    @Override
    public String printName() {
        return "Тигр";
    }
}
