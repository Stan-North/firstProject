package homework3.factory;

public class Camera {
    private int megaPixels;

    public Camera(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    protected void takePhoto() {
        System.out.println("сделано фото");
    }
}
