package Day07_Unary_ShortHand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ShortHand {
    public static void main(String[] args) {

        // * multiplicatin
        int a=100;
        // longer way a=a*a; 10000
        a*=100;
        System.out.println(a);

        int b =2;
        b *=3;
        System.out.println(b);


        System.out.println("==========================");

        // - subtraction

        int c=300;
        c-=100;
        System.out.println(c);

        System.out.println("=================================");

        // + addition  you can apply String and the numbers
        int z=300;
        z+=200;
        System.out.println(z);

        String FirsName="Murat";
        String LastName=" Degirmenci";

        FirsName+=LastName;
        System.out.println(FirsName);

        String Team="GALATASARAY";
        Team+=" CHAMPION 1905 ";
        System.out.println(Team);

        // Division

        int g =1500;
        g/=3;  // long way g=1500/3=500
        System.out.println(g);

        int budget = 100000;
        budget/=2;
        System.out.println(budget);

        // % Remainder assignment

        int at =10;
        at%=2;
        System.out.println(at);

        int num=100;
        num%=3;
        System.out.println(num);

        double num2=400.5;
        num2%=2;
        System.out.println(num2);

        int q=3, s=2;
        long qw=(q+s)*2/3%2;










    }
}
