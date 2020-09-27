package Day57_Polymorphism.CarTask;

public abstract class Car {
    public String brand;
    public String model;
    public int year;
    public Double price;
    public String color;

   protected static boolean hasEngine=true;

    public Car(String brand, String model, int year, Double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
