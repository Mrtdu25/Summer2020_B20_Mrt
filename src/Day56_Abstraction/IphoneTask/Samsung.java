package Day56_Abstraction.IphoneTask;

final public class Samsung extends Phone{

    public Samsung(String model, double price, double size) {
        super("Samsung",model, price, size);
        if (price<=0 && price>1200){
            throw new RuntimeException("Invalid price"+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber1, long phoneNumber2) {
        texting(phoneNumber1);
        texting(phoneNumber2);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    public void faceTiming(long phoneNumber1){
        System.out.println("Iphone is facetiming");
    }
    public void faceTiming(long phoneNumber1,long phoneNumber2){
        faceTiming(phoneNumber1);
        faceTiming(phoneNumber2);

    }

    @Override
    public String toString() {
        return "Samsung Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size=" + size +
                '}';
    }
}
