
public class BMW extends Car{

    public BMW(String model) {
        super(model);
    }
    
    @Override
    public String toString() {
        return String.format("BMW@%s", super.model);
    }
}
