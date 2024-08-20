package homework4.ex1;

public abstract class Car {
    private boolean isClean = false;
    private double width; //ширина
    private double height; //высота
    private double length; //длина

    protected Car(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLenght() {
        return length;
    }
}
