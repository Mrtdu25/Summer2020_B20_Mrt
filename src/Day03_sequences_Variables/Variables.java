package Day03_sequences_Variables;
/* declare variables:
                 DataType    VariableName=Data;
 */

public class Variables {


    public static void main(String[] args) {
        // Length;2   Width: 4  Area:8

        byte length =11;
        byte width =12;
        System.out.println(11*12); // or
        System.out.println(length*width);

        //  Long > Int > Short > Byte

        //140
       //byte range max 127 hence we cant byte num1=140; we need to use short

        short num2 =140;

        //40000
        int num3 =40000;

        //3.000.000
        long num4 =3000000;

        long largenumber = 99999999999l; // if the system see number as an int you need to add l


        int score =100;

        System.out.println(score);


        //Decimal Numbers  Double(LARGER DECIMAL VARIABLES) & Float  EXP;3.14, 2.5 ETC
        // PI =3.14
        double PI =3.14;
        System.out.println(PI);

        float decimal1 =3.5f; // if the system see the number as and double variables use F or f

        //always use double for decimal numbers







    }
}
