package homework5.ex1;

public enum CountriesEnum {
    RUSSIA("Россия"),
    FRANCE("Франция"),
    CHINA("Китай"),
    JAPAN("Япония"),
    TURKEY("Турция");

    private final String name;

    CountriesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
