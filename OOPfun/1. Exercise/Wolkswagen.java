public class Wolkswagen extends Car {

    public Wolkswagen(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return String.format("BMW@%s", super.model);
    }
}
