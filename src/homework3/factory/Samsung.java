package homework3.factory;

public class Samsung extends Phone {
    public Samsung(Processor processor, Camera camera, Corpus corpus) {
        super(processor, camera, corpus);
    }

    public void takePhoto() {
        camera.takePhoto();
    }
}
