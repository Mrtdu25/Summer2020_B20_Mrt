package Day54_Abstraction.AnimalTask;

public class Zoo {
    public static void main(String[] args){
        Dog dog1=new Dog("Karabas",5,"Black",'M',"Kangal");
        System.out.println(dog1);
        dog1.eat();
        dog1.sleep();

        System.out.println("==========================================================");

        Lion lion1=new Lion("Kral",5,"Gold",'M',"An African lioness");
        System.out.println(lion1);
        lion1.eat();
        lion1.sleep();

        System.out.println("============================================================");

        Horse horse1=new Horse("Gulbatur",4,"White",'F',"Akhal-Teke");
        System.out.println(horse1);
        horse1.eat();
        horse1.sleep();



    }
}
