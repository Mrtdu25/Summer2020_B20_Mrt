package Day51_Exceptions.PetTask;

public class Dog extends Pet{

    double price;

    public Dog(String name, String breed, char gender, int age, String color,double price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }

    public void eat(){
        System.out.println(name+" eating a Red Snapper fish");
    }

    public void drink(){
        System.out.println(name+" is drinking water");
    }



}
