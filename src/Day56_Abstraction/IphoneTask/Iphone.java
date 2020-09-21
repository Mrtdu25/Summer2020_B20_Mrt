package Day56_Abstraction.IphoneTask;

public final class Iphone extends Phone {
    public Iphone(String model, double price, double size) {
        super("Iphone",model, price, size);
        if (price<=0 && price>1500){
            throw new RuntimeException("Invalid price: "+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling to "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber1, long phoneNumber2) {
        texting(phoneNumber1);
        texting(phoneNumber2);
    }

    public void disadvantage(){
        System.out.println("Gets bigger and bigger every year and adds one more camera for each year :)");
    }

    @Override
    public String toString() {
        return "Iphone"+ super.toString();
    }
}
