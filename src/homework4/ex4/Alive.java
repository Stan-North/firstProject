package homework4.ex4;

public abstract class Alive {
    private boolean isAlive = true;
    private int weight;

    protected Alive(int weight) {
        this.weight = weight;
    }

    public void die() {
        this.setAlive(false);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public abstract String printName();
}
