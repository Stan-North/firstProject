package homework3.factory;

public class SamsungFactory {

    public static Samsung createPhone() {
        Processor firstProcessor = new Processor(1500);
        Camera camera = new Camera(16);
        Corpus corpus = new Corpus(60,200,15);

        System.out.println("Телефон Samsung создан!");
        return new Samsung(firstProcessor, camera, corpus);
        }
}
