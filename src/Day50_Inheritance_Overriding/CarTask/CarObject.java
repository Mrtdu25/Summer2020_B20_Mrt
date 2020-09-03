package Day50_Inheritance_Overriding.CarTask;

public class CarObject {
    public static void main(String[] args) {

        Honda honda=new Honda();
        Mercedes mercedes=new Mercedes();
        Tesla tesla=new Tesla();
        Jeep jeep=new Jeep();
        BMW BMW=new BMW();

        honda.start();
        System.out.println("==================");
        mercedes.start();
        System.out.println("==================");
        tesla.start();
        System.out.println("====================");
        jeep.start();
        System.out.println("========================");
        BMW.start();
        System.out.println("========================");




    }
}
