package Day08_LogicalOperators;
/*warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
 */

public class Gallons_To_Litters {
    public static void main(String[] args) {

        double lb=3.785;
        double lt=1;


        System.out.println("1 litter = "+lt/lb+"lb");
        System.out.println("1 gallon = "+lb/lt+" lt");

        System.out.println("====================");
        double gallons =15;
        double litters=gallons *3.785;

        System.out.println(gallons+" gallons equal to "+litters+ " litters ");




    }

}
