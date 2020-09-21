package Day56_Abstraction.AnimalTask;

public class Duck extends Animal implements Flyable,Swimable,Playable {
    @Override
    public void eat() {
        System.out.println("Duck is eating bread");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping on the lake");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing with the kids");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming on the lake");
    }
}
