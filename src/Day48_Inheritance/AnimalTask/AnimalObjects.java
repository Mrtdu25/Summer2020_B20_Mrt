package Day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
       //1
        Dog dog1=new Dog("Winston","Medium",3, 'M',"Kangal",50);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();
        System.out.println(dog1);
        System.out.println("================================");

        //2
        Cat cat1= new Cat("Altunhan","small",1, 'F',"Persian",15);
        System.out.println(cat1);
        cat1.meow();
        System.out.println("=================================");

        //3
        Bird bird1=new Bird("Dadas","Big",2,'M',"Eagle",25);
        System.out.println(bird1);
        bird1.sing();
        System.out.println("=================================");

        //4
        Fish fish1=new Fish("Memo","small",5,'F',"Salmon",5);
        System.out.println(fish1);
        fish1.swim();

    }
}
