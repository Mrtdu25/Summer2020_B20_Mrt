package Day59_OOPReview;

import Day58_Polymorphism.AnimalTask.Animal;
import Day58_Polymorphism.AnimalTask.Dog;

public class Polymorphism {

    public static void main(String[] args) {

        Animal animal1=new Dog("Jessi",5,'M');
        animal1.eat();
        animal1.sleep();

        Dog dog1= (Dog) animal1;
        dog1.bark();


    }
}
