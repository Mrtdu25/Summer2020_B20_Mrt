package Day03_sequences_Variables;

public class Variables_Practice {

    public static void main(String[] args) {
        //100  200

        byte num1 =100;
        short num2=200;
        System.out.println(num1+num2);
        int sum =num1+num2;
        System.out.println(sum);

      float num3 =3.5f;
      double a =num3;

      // long b = num3 ;

        long x =100;
        float y = x;
        double z =x;

        System.out.println(x); //100
        System.out.println(y); //100.0
        System.out.println(z);// 100.0

        float f1 =100;
        float f2=100.0f;

        System.out.println(f1);
        System.out.println(f2);

        byte byteNumber=25;
        short shortNumber=3500;
        int intNumber=350000000;
        long longNumber=3500000000l;
        double doubleNumber=35567.54;
        float floatNumber=459900.79f;

        System.out.println("byte plus short "+byteNumber*shortNumber);
        System.out.println("int long double "+intNumber+longNumber/doubleNumber);



    }






}
