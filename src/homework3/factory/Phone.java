package homework3.factory;

public abstract class Phone {
    protected Processor processor;
    protected Camera camera;
    protected Corpus corpus;

    protected Phone(Processor processor, Camera camera, Corpus corpus) {
        this.processor = processor;
        this.camera = camera;
        this.corpus = corpus;
    }

}
