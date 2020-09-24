package Day57_Polymorphism.PhoneTask;

public class PhoneObject {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "6.1", 899 );
        Huawei huawei = new Huawei("Robbery", "5.3", 25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);


        Phone phone=new Iphone("11","6",1200);
        Phone phone1=new Samsung("s8","6.5",900);
        Phone phone2=new Huawei("try","5.7",200);

        Phone[] phones={phone,phone1,phone2};


        int a=(int)2.5;
        System.out.println(a);

    }
}
