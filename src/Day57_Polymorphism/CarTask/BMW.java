package Day57_Polymorphism.CarTask;

public class BMW extends Car {
    public BMW(String brand, String model, int year, Double price, String color) {
        super("BMW", model, year, price, color);
        if (price>45000){
            throw new RuntimeException("This price exceed our budget");
        }
    }

    @Override
    public void start() {
        System.out.println("Double click car key");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void Mmode(){
        System.out.println("You can select M mode");
    }
}
