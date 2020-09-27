package Day57_Polymorphism.CarTask;

public class Mercedes extends Car {

    public Mercedes(String brand, String model, int year, Double price, String color) {
        super("Mercedes", model, year, price, color);
        if (year<2017){
            throw new RuntimeException("We need 2017 or newer model");
        }
    }

    @Override
    public void start() {
        System.out.println("Starts with car key and starts button");
    }
}
