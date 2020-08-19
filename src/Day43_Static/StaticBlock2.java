package Day43_Static;

import Day42_static.Car;
import Day42_static.Developer;
import Day42_static.Tester;

public class StaticBlock2 {

    static int a;
    static String b;
    static Tester tester1;
    static Developer dev1;

    static {
        a=100;
        b="Cybertek";

        tester1=new Tester();
        tester1.setInfo("Murat",'M',12354,"SDET",100000);

        dev1.setInfo("Muhtar",'M',12544,"Developer",150000);





    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }


}
