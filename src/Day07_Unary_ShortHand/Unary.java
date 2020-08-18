package Day07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {


        //ex1
       System.out.println( -1 + - 10);

        //ex2
        System.out.println( -11 - 10); // -11+10=-1

     // --: pre decrements

        int a =20;
        //a=a+1;
        --a;
        System.out.println(a); // -- means -1

        //++ pre increments
        int b=10;
        // b=b+1; b=11 but if we do ++ add +1 and if we do --  -1
        ++b;
        System.out.println(b);

        int x=100;
        System.out.println(++x); //101

        int y=200;
        System.out.println(--y); //199

        System.out.println("==================================");

        int gs=1906;
        System.out.println(--gs);

        int Gs=1904;
        System.out.println(++Gs);










    }



}
