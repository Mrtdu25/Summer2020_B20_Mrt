package Office_Hours.Practice_09_09_2020;

public class Samsung extends Phone {
    public Samsung(String model, double price) {
        super(model, price);
    }

    static{
        madeIn="Korea";
        brand="Samsung";
    }

    @Override
    public void call(long phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        super.text(phoneNumber);
    }
}
