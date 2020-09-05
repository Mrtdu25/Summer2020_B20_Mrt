package Day51_Exceptions.PetTask;

public class Cat extends Pet {

    public double price;

    public Cat(String name, String breed, char gender, int age, String color,double price) {
        super(name, breed, gender, age, color);
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }

    public void eat(){
        System.out.println(name+" eating liver");
    }

    public void drink(){
        System.out.println(name+" is drinking milk");
    }

    @Override
    public String toString() {
        return "Cat{" +
                ", name='" + name +
                ", breed='" + breed +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color+"price=" + price;
    }
}
