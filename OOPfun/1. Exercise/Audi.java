
public class Audi extends Car{

    public Audi(String model) {
        super(model);
    }
    
    @Override
    public String toString() {
        return String.format("Audi@%s", super.model);
    }
}
