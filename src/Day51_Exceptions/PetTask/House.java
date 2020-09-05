package Day51_Exceptions.PetTask;

public class House {
    public static void main(String[] args) {

        Dog dog1=new Dog("Jessie","Golden Retriever",'F',5,"Brown",1500);
        System.out.println(dog1.name);
        System.out.println(dog1);
        dog1.eat();
        dog1.drink();

        Cat cat1 = new Cat("Nemo","Angora",'F',4,"Orange",1000);
        cat1.eat();
        cat1.drink();


        Tiger tiger1 = new Tiger("Copito","Bengal",'F',7,"White and black",10000);
        tiger1.drink();
        tiger1.eat();

    }
}
