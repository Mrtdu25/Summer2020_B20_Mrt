package Day56_Abstraction.IphoneTask;
/*1. create an abstract class called Phone
        attributes: brand, model, price, size
abstract methods: calling(), texting();
        instance method: toString()
        add a constructor that can initialize all the instances*/

public abstract class Phone {

    public String brand;
    public String model;
    public double price;
    public double size;

    public Phone(String brand,String model, double price, double size) {
        this.brand=brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public abstract void calling(long phoneNumber);
    public abstract void texting(long phoneNumber);
    public abstract void texting(long phoneNumber1,long phoneNumber2);


    public String toString(){
        return "Brand; "+brand+", Model: "+model+"Size: "+size+", Price: "+price;
    }



}
