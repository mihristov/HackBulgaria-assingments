public class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car";
    }

    public static void main(String[] args) {

        Car myCar = new Audi("SS");
        System.out.println(myCar.toString());
    }
}
