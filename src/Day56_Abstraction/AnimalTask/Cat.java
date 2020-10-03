package Day56_Abstraction.AnimalTask;

public class Cat extends Animal implements Playable {
    public Cat(String jessi, int i, char m) {
        super(jessi, i, m);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }


    @Override
    public void play() {
        System.out.println("Cat is playing with rope ball");
    }
}
