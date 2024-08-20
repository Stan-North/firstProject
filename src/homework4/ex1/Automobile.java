package homework4.ex1;

public class Automobile extends Car {
    private boolean isCruisControlAvailable;

    public Automobile(double width, double height, double length, boolean isCruisControlAvailable) {
        super(width, height, length);
        this.isCruisControlAvailable = isCruisControlAvailable;
    }
}
