package Day54_Abstraction.AnimalTask;

public class Lion extends Animal {
    public Lion(String name, int age, String color, char gender, String breed) {
        super(name, age, color, gender, breed);
    }

    @Override
    public void eat() {
        System.out.println(name+" is eating a Zebra");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping under the tree");
    }
}
