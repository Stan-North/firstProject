package homework3.factory;

public class IphoneFactory {

    public static Iphone createPhone() {
        Processor firstProcessor = new Processor(1000);
        Processor secondProcessor = new Processor(1000);
        Camera camera = new Camera(8);
        Corpus corpus = new Corpus(60, 200, 10);

        System.out.println("Телефон iPhone создан!");
        return new Iphone(firstProcessor, secondProcessor, camera, corpus);
    }
}
