package Day51_Exceptions.PetTask;

public class Tiger extends Pet{
    private double price;
    public Tiger(String name, String breed, char gender, int age, String color,double price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }


    public void roar(){
        System.out.println(name+" is roaring");
    }

    public void eat(){
        System.out.println(name+ " is eating whole roasted deer");
    }

    public void drink(){
        System.out.println(name+ " is drinking blood");
    }


    @Override
    public String toString() {
        return "Tiger{" +

                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + "price=" + price;
    }
}
