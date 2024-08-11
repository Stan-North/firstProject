package homework3.factory;

public class Iphone extends Phone {
    private Processor secondProcessor;

    public Iphone(Processor firstProcessor, Processor secondProcessor, Camera camera, Corpus corpus) {
        super(firstProcessor,camera,corpus);
        this.secondProcessor = secondProcessor;
    }

    public void printProcessorInfo () {
        System.out.println("количество вычислений в секунду первого процессора: " + this.processor.mhz);
        System.out.println("количество вычислений в секунду второго процессора: " + this.secondProcessor.mhz);
    }

    public void takePhoto() {
        camera.takePhoto();
    }
}
