package Day57_Polymorphism.CarTask;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Lexus extends Car {
    public Lexus(String brand, String model, int year, Double price, String color) {
        super("Lexus", model, year, price, color);
        if (color=="Red" && color=="Orange"){
            throw new RuntimeException("The color options does not match with the requirement");
        }
    }

    @Override
    public void start() {
        System.out.println("Say something Japanese");
    }
}
