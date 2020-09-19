package Day54_Abstraction.AnimalTask;

public class Horse extends Animal {
    public Horse(String name, int age, String color, char gender, String breed) {
        super(name, age, color, gender, breed);
    }

    @Override
    protected void eat() {
        System.out.println(name+" is eating grass and carrots");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping in the barn");
    }
}
