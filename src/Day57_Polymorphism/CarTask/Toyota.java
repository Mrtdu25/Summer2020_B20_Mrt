package Day57_Polymorphism.CarTask;

public class Toyota extends Car{
    public Toyota(String brand, String model, int year, Double price, String color) {
        super("Toyota", model, year, price, color);
        if (price>25000 || year>2019){
            throw new RuntimeException("Do not buy");
        }
    }

    @Override
    public void start() {

    }
}
