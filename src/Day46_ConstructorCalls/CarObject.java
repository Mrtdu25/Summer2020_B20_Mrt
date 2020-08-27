package Day46_ConstructorCalls;

public class CarObject {
    public static void main(String[] args) {

        Car car1=new Car("BMW");
        System.out.println(car1);
        Car car2=new Car("Audi","A7");
        System.out.println(car2);
        Car car3=new Car("Mercedes","C63","Black");
        System.out.println(car3);
        Car car4=new Car("Lamborghini","Urus","Silver",2020);
        System.out.println(car4);
        Car car5=new Car("Toyota","Avalon",2017,"Blue",35000);
        System.out.println(car5);



    }
}
