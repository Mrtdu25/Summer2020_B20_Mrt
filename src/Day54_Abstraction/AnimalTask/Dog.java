package Day54_Abstraction.AnimalTask;

public class Dog extends Animal {


    public Dog(String name, int age, String color, char gender, String breed) {
        super(name, age, color, gender, breed);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping on the dog bed");
    }
}
