package Day03_sequences_Variables;

public class KgToLb {
    public static void main(String[] args) {

        double kg =92.4;
        double pound=kg*2.2;

        System.out.println(pound);


        // task 2 gallons to litters

        // 1 gallon =3.7854 l
        //
      double gl120 =120;
      double litre=gl120*3.7854;
        System.out.println(litre);


        double lt1250=1250;
        double lb=lt1250/3.7854;
        System.out.println(lb);

        double myWeightKg=98;
        double myWeightPound=myWeightKg*2.2;
        System.out.println("myWeightPound = " + myWeightPound);

        double backToKg = myWeightPound / 2.2;
        System.out.println("backToKg = " + backToKg);


    }
}
